package cn.zealon.modifier.codeblock;

/**
 * 静态代码块
 * @auther: Zealon
 */
public class UseCodeBlock3 {

    {
        System.out.println("执行构造代码块1.");
    }

    {
        System.out.println("执行构造代码块2.");
    }

    static {
        System.out.println("执行静态代码块1.");
    }

    static {
        System.out.println("执行静态代码块2.");
    }

    public UseCodeBlock3(){
        System.out.println("执行构造方法.");
    }

    public static void main(String[] args){
        new UseCodeBlock3();
    }
}
