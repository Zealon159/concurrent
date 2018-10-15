package cn.zealon.java8.ch3;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 10:53
 */
public class FinalCase {
    public static void main(String[] args){
        //System.out.println();
        //caseEquals();

        System.out.println(caseTry());
    }

    public static void case1(){
        final StringBuffer a = new StringBuffer("hello.");
        a.append("world.");
        System.out.println(a);
    }

    static void caseEquals(){

        String s="a"+"b"+"c"+"d";
        String s1 = "abcd";
        System.out.println(s == s1 );

        String a = null;
        if("aa".equals(a)){
            System.out.println("aaaaa");
        }
    }

    static boolean caseReturn(){
        int x = 1;
        return x==1?true:false;
    }

    static String caseTry(){
        String a = "";
        try {
            a="abc";
            return a;
        }finally {
            a = "d";
            System.out.println("run finally ...");
        }
    }
}
