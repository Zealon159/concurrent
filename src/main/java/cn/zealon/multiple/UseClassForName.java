package cn.zealon.multiple;

import java.util.Date;

/**
 * class.forName的作用
 * @Author: zealon
 * @Version: 1.0
 */
public class UseClassForName {
    public static void main(String[] args){
        //System.out.println(new Date().getClass());
        try {
            //使用forName ，按类的全路径名，动态创建Class
            Class<?> date = Class.forName("java.util.Date");
            //通过Class，创建实例对象
            Date dateInstance = (Date) date.newInstance();
            System.out.println(dateInstance.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
