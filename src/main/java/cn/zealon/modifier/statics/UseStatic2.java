package cn.zealon.modifier.statics;

/**
 * static修饰方法(即静态方法)
 * <p>被static修饰的属性，可以用"类名.方法名"来访问</p>
 * @Author: zealon
 * @Version: 1.0
 */
public class UseStatic2 {
    static void say(String words){
        System.out.println("say:"+words);
    }
    public static void main(String[] args){
        say("Hello,World!");
    }
}
