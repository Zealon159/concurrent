package cn.zealon.modifier.statics;

/**
 * static修饰属性
 * <p>被static修饰的属性，可以用"类名.方法名"来访问</p>
 * @Author: zealon
 * @Version: 1.0
 */
public class UseStatic1 {
    static String sayHi = "Hello,World!";
    public static void main(String[] args){
        System.out.println(sayHi);
    }
}
