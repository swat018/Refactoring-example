package me.swat018;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AnotherAnnotation {

   String value() default "a";

   int number() default  100;

}
