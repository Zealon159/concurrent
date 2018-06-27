package cn.zealon.modifier.codeblock;

/**
 * 构造代码块
 * @auther: Zealon
 */
public class UseCodeBlock2 {
    {
        System.out.println("执行构造代码块1.");
    }

    public UseCodeBlock2(){
        System.out.println("执行构造方法.");
    }

    {
        System.out.println("执行构造代码块2.");
    }

    public static void main(String[] args){
        new UseCodeBlock2();
    }
}
