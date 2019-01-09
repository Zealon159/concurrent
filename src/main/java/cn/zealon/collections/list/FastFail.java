package cn.zealon.collections.list;

import java.util.*;

/**
 * @auther: Zealon
 * @Date: 2018-11-16 09:34
 */
public class FastFail {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("key:"+i+1);
        }
        System.out.println(list);

        fastFail(list);
        //remove(list);
    }

    //迭代器删除
    private static void remove(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }

    // foreach 删除
    private static void fastFail(List<String> list){
        for (String str : list){
            list.remove(str);
        }
        System.out.println(list.toString());
    }
}
