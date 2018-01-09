package ro.springhotel.hotel;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * @author Raul Dunca
 */
@Aspect
@Component
public class MonitoringAspect {
    private static final Logger LOGGER= LoggerFactory.getLogger(MonitoringAspect.class);
    @Around("execution(* ro.springhotel.mvc.*.*(..)) ")
    public Object audit(final ProceedingJoinPoint call) throws Throwable {

        long start = System.currentTimeMillis();
        try{
            return call.proceed();
        }finally {
            LOGGER.info(call.getSignature().getName() + ": " + (System.currentTimeMillis() - start) + " ms");
        }
    }
}
