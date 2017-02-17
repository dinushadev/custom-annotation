package com.custom.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dinusha on 13/02/17.
 */
//@Component
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Alow {

    String[] value() default "";
}
