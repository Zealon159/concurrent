package cn.zealon.classloader;

import java.net.URLClassLoader;

/**
 * @auther: Zealon
 * @Date: 2018-09-29 14:22
 */
public class ch1 {
    public static void main(String[] args){

        try {

            ClassLoader classLoader= ClassLoader.getSystemClassLoader();
            while (classLoader!=null){
                System.out.println(classLoader.getClass().getCanonicalName());
                classLoader = classLoader.getParent();
            }

            Class<User> userClass = (Class<User>) ClassLoader.getSystemClassLoader().loadClass("cn.zealon.classloader.User");
            //user.
            User user = userClass.newInstance();
            user.setUserName("aaa");

            System.out.println(user.getUserName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public static void loadClass(){
        //URLClassLoader
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
