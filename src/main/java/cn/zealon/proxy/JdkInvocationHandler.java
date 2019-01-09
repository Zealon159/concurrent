package cn.zealon.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther: Zealon
 * @Date: 2018-10-19 15:00
 */
public class JdkInvocationHandler implements InvocationHandler {

    private ProductService target;
    public Object getInstance(ProductService target){
        this.target = target;
        Class clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("---前置动作---");
        Object result = method.invoke(this.target,args);
        System.out.println("---后置动作---");
        for(Object obj : args){
            System.out.println(obj.toString());
        }
        return result;
    }


}
