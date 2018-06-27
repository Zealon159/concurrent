package cn.zealon.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 数组列表
 * 底层数据结构是数组，查询快，增删慢;线程不安全，效率高
 * @Author: zealon
 * @Version: 1.0
 */
public class UseArrayList {
    public static void main(String[] args){
        List list = new ArrayList();
        for(int i=1;i<=5;i++){
            String string = "黑足猫"+i;
            list.add(string);
        }
        System.out.println(list.toString());

    }
}
