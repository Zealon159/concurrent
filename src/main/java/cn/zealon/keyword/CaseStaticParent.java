package cn.zealon.keyword;

/**
 * @auther: Zealon
 * @Date: 2018-11-16 16:07
 */
public class CaseStaticParent {
    static {
        System.out.println("parent static block.");
    }

    public CaseStaticParent(){
        System.out.println("parent 构造器.");
    }

    {
        System.out.println("parent block.");
    }
}
