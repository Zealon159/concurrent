package cn.zealon.collections.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 数组列表
 * 底层数据结构是数组，查询快，增删慢;线程不安全，效率高
 * @Author: zealon
 * @Version: 1.0
 */
public class UseArrayList {
    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        for(int i=1;i<=5;i++){
            String string = "黑足猫"+i;
            list.add(string);
        }

        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            list.remove(list.get(i));
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String item = (String) iterator.next();
            if (item.equals("黑足猫3")) {
                iterator.remove();
            }
        }

        Thread.sleep(1000);
        System.out.println(list.toString());
    }
}
