package cn.zealon.reflex;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther: Zealon
 * @Date: 2018-11-12 10:14
 */
public abstract class Test {

    private int i;
    private String name;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Test.class;
        /*System.out.println(clazz.getModifiers());
        System.out.println(clazz.getCanonicalName());
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        Class clazz1 = Test.class;*/

        /*Method method = clazz.getMethod("print", String.class);
        method.setAccessible(true);
        method.invoke(null,"ff");

        float a = 1.113F;
        Float f = 1.1F;
        double b = 1;

        System.out.println(a);*/

        float f = (float) (10/3);
        double d = 10/3;
        System.out.println(f);
        System.out.println(d);


        float f1 = 0.333333333333333333333333333F*1000000;
        double d1 = 0.55555555555555555555555555555;
        System.out.println(f1);

        System.out.println(d1);
    }

    public static void print(String name){
        System.out.println("print:"+name);
    }
}
