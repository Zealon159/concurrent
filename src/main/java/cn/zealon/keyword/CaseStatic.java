package cn.zealon.keyword;

/**
 * @auther: Zealon
 * @Date: 2018-11-16 16:05
 */
public class CaseStatic extends CaseStaticParent {
    static {
        System.out.println("static block.");
    }

    public CaseStatic(){
        System.out.println("构造器.");
    }

    {
        System.out.println("block.");
    }

    public static void main(String[] args){
        CaseStatic c1 = new CaseStatic();

    }
}
