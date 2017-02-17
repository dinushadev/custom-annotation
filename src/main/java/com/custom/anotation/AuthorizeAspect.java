package com.custom.anotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by dinusha on 13/02/17.
 */

@Aspect
@Component
public class AuthorizeAspect {

    @Before(value = "@annotation(com.custom.anotation.Alow)  && @annotation(alow)")
    public void before(JoinPoint caller, Alow alow) {

        System.out.println("Groups: "+Arrays.toString( alow.value()));


      /*  OAuth2Authentication auth = (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
        Map map = (LinkedHashMap) auth.getUserAuthentication().getDetails();
        if(!(Arrays.asList(alow.value()).contains("group1") && Arrays.asList(alow.value()).contains("group2"))){
            throw  new HTTPException(401);
        }*/
        Method method = getCurrentMethod(caller);



    }



    private Method getCurrentMethod(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        return signature.getMethod();
    }
}
