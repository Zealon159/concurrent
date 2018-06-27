package cn.zealon.collections.list;

import java.util.Vector;

/**
 * Vector
 * <p>
 *     线程安全，好多方法都被synchronized所修饰。
 *     Vector容量需要扩增时，默认增长一倍，而且增长容量可配置。
 * </p>
 * @Author: zealon
 * @Version: 1.0
 */
public class UseVector {
    public  static void main(String[] args){
        Vector<String> vi = new Vector();
        for(int i=1;i<=5;i++){
            String string = "黑足猫"+i;
            vi.add(string);
        }

        for(int i=0;i<vi.size();i++){
            System.out.println(vi.get(i));
        }

        System.out.println("容量大小："+vi.capacity());
        for(int i=6;i<=41;i++){
            String string = "黑足猫"+i;
            vi.add(string);
        }
        System.out.println("容量大小："+vi.capacity());
        vi.ensureCapacity(30);
        System.out.println("容量大小："+vi.capacity());
    }
}
