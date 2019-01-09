package cn.zealon.thread.mycase;

/**
 * @auther: Zealon
 * @Date: 2019-01-03 16:59
 */
public class CaseThreadLocal {
    private static ThreadLocal<String> local = new ThreadLocal<>();
    public static void main(String[] args){
        local.set("a");
        local.get();

        Integer a = 100;
        Integer b = 100;
        int c = 128;

        Integer d = 128;
        Integer e = 128;
        System.out.println(a==c);
        System.out.println(d==c);

        System.out.println(Integer.MIN_VALUE);
    }
}
