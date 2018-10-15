package cn.zealon.java8.ch1;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 09:22
 */
public class OperatorCase {
    public static void main(String[] args){
        System.out.println(operator2(3));
    }

    public static int case2(int num){
        num+=1;
        System.out.println("case2");
        return num;
    }

    static int operator2(int n){
        int num = 1<<n;
        return num;
    }
}
