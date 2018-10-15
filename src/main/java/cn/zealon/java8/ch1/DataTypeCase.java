package cn.zealon.java8.ch1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 09:37
 */
public class DataTypeCase {
    public static void main(String[] args){
        charCase();
    }

    public static void charCase(){
        char c = '號';
        char b = 23200;
        //String s = new String(c.);
        int d = c;
        System.out.println(c);

        byte b1 = (byte) c;
        byte b2 = 127;
        char c2 = (char) b2;
    }

    public static void shortCase(){
        short a = 1;
        a++;
        //a += 1;
        int b = a++;
        System.out.println(a);
    }

    public static void byteCase(){
        byte a = 127;
        Byte b = new Byte(a);
        String c = b.toString();
        Byte by2 = new Byte("129");
        byte aaa = by2.byteValue();
        System.out.println();
    }

    public static void swichCase(){
        //int v = 1;
        //byte v = 3;
        //char v = 5;
        String v = "11456";

        switch (v){
            case "1":
                System.out.println("111");
                break;
            case "2":
                System.out.println("222");
            case "3":
                System.out.println("333");
            default:
                System.out.println("default");
                break;
        }

        int a=20,b=19;

        System.out.println(a==(++b));
    }
}
