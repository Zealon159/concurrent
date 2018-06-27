package cn.zealon.modifier.codeblock;

/**
 * 父类
 * @auther: Zealon
 */
public abstract class CodeBlock {
    static {
        System.out.println("执行abstract CodeBlock静态代码块.");
    }

    {
        System.out.println("执行abstract CodeBlock构造代码块.");
    }

    public CodeBlock(){
        System.out.println("执行abstract CodeBlock构造方法.");
    }
}
