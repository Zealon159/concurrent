package cn.zealon.annotation;

import java.lang.annotation.*;

/**
 * @auther: Zealon
 * @Date: 2018-10-16 11:24
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Writer {
    String name() default "zealon";
    int age() default 15;
}
