package cn.zealon.java8.ch2;

/**
 * @auther: Zealon
 * @Date: 2018-10-08 16:59
 */
public class StringCase {
    public static void main(String[] args){
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4);
    }
}
