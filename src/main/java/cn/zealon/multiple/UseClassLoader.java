package cn.zealon.multiple;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @auther: Zealon
 * @Date: 2018-07-03 09:36
 */
public class UseClassLoader {

    public void sayHi(String words){
        System.out.println("say:"+words);
    }

    public static void main(String[] args){
        loadClass("cn.zealon.multiple.UseClassLoader");
        loadResources("resources.txt");
    }

    /**
     * 加载class对象
     * @param className
     */
    public static void loadClass(String className){
        try {
            Class aClass = ClassLoader.getSystemClassLoader().loadClass(className);
            UseClassLoader object = (UseClassLoader)aClass.newInstance();
            object.sayHi("你好！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载资源文件
     * @param resourceName
     */
    public static void loadResources(String resourceName){
        //加载当前源码根目录的文件（classes/下）
        InputStream in = UseClassLoader.class.getClassLoader().getResourceAsStream(resourceName);


        int ch;
        try {
            while (((ch=in.read()) != -1)){
               System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
