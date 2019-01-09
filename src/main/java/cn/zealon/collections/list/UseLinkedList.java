package cn.zealon.collections.list;

import java.util.LinkedList;
import java.util.List;

/**
 * 链表
 * 底层数据结构是链式，查询慢，增删快;线程不安全，效率高
 * @Author: zealon
 * @Version: 1.0
 */
public class UseLinkedList {

    public static void main(String[] args){
        List<String> list = new LinkedList<String>();
        list.clear();
        for(int i=1;i<=5;i++){
            String string = "黑足猫"+i;
            list.add(string);
        }
        System.out.println(list.toString());
        //指定位置增加元素
        list.add(3,"家猫");
        System.out.println(list.toString());
        //在列表最后添加元素
        ((LinkedList<String>) list).addLast("豹猫");
        System.out.println(list.toString());

        //指定位置移除元素
        list.remove(2);
        System.out.println(list.toString());


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
