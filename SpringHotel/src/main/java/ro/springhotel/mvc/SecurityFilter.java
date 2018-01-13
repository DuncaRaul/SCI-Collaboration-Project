package ro.springhotel.mvc;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ro.springhotel.hotel.domain.User;
import ro.springhotel.hotel.service.SecurityService;

public class SecurityFilter implements Filter {

    @Autowired
    private SecurityService securityService;

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        chain.doFilter(request, response);

        User user = (User) ((HttpServletRequest) request).getSession().getAttribute("currentUser");

        securityService.setCurrentUser(user);

        String url = ((HttpServletRequest) request).getRequestURL().toString();

        if (url.contains("client")) {
            if (user == null) {
                HttpServletResponse servletResponse = (HttpServletResponse) response;
                servletResponse.sendError(401);
                servletResponse.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
                servletResponse.setHeader("Location", "/login");
                return;
            } else {
                //if authorized do nothing
				if (false) {
					//not authorized
						HttpServletResponse servletResponse = (HttpServletResponse) response;
						servletResponse.sendError(401);
						return;
				}
            }
        }

         System.out.println("Thread name: " + Thread.currentThread().getName()
         +
         ", current user: " + (user != null ? user.getUserName() : null));


        chain.doFilter(request, response);


    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }

}
