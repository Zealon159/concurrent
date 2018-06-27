package cn.zealon.modifier.codeblock;

/**
 * 子类继承父类代码块执行顺序的综合用例
 * @auther: Zealon
 */
public class UseCodeBlock4 extends CodeBlock {
    static {
        System.out.println("执行静态代码块.");
    }

    {
        System.out.println("执行构造代码块.");
    }

    public UseCodeBlock4(){
        System.out.println("执行构造方法.");
    }

    public static void main(String[] args){
        new UseCodeBlock4();
    }
}
