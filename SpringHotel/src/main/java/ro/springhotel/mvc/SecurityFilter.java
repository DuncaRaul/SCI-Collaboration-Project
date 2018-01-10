package ro.springhotel.mvc;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.security.Security;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class SecurityFilter implements Filter {

//    @Autowired
//    private SecurityService securityService;


    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
