package me.swat018;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface MyAnnotation {

   String name() default "jinwoo";

   String value() default "seojin";

   int number() default  100;

}
