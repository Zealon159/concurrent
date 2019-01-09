package cn.zealon.annotation;

import java.lang.reflect.Method;

/**
 * @auther: Zealon
 * @Date: 2018-10-16 11:27
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("cn.zealon.annotation.WriterTest");
        Method[] methods = c.getMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(Writer.class)) {
                Writer writer = method.getAnnotation(Writer.class);
                System.out.println("name:" + writer.name() + ",age:" + writer.age());
            }
        }
    }
}
