package cn.zealon.annotation;

/**
 * @auther: Zealon
 * @Date: 2018-10-16 11:28
 */
public class WriterTest {
    @Writer(name = "wang",age = 50)
    public void writeInfo(){
        System.out.println("write info.");
    }
}
