package cn.zealon.modifier.statics;

/**
 * static修饰代码块
 * <p>
 *     代码块叫做静态代码块，在类加载时被执行一次。
 *     代码块会最先执行。
 *     可以用静态初始化代码块初始化一个类。
 * </p>
 * @Author: zealon
 * @Version: 1.0
 */
public class UseStatic3 {
    static {
        System.out.println("执行static代码块.");
    }
    public static void main(String[] args){
        System.out.println("执行mian方法.");
    }
}
