package cn.zealon.modifier.codeblock;

/**
 * 普通代码块
 * 定义：在方法体内使用{}声明，按代码顺序执行；
 * 作用：可以在代码块中定义局部变量，限定变量的生命周期。
 * @auther: Zealon
 */
public class UseCodeBlock1 {

    public static void main(String[] args){
        int num = 0;
        {
            num = 1;
            System.out.println(num);
        }

        num = 159;
        System.out.println(num);

        {
            double price = 4.5;
            double total = price*num;
            System.out.println(total);
        }
    }
}
