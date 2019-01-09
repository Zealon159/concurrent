package cn.zealon.java8.ch2;

import java.util.*;

/**
 * @auther: Zealon
 * @Date: 2018-09-03 15:41
 */
public class HashMapCase {
    public static void main(String[] args){
       /* Map map = new HashMap(1);

        map.put("a","a");
        map.put("b","b");
        map.put(null,"c");
        map.put(null,"d");

        map.remove(null);
        System.out.println(map.get(null));

        Object obj = new Object();
        obj.hashCode();

        List a;*/



        Map m1 = new HashMap();
        m1.put("e","e");
        m1.put("a","a");
        m1.put("z","z");
        m1.put("d","d");
        m1.put("b","b");
        Iterator<Map.Entry> iterator = m1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("--------------");
        Map m2 = new LinkedHashMap();
        m2.put("e","e");
        m2.put("a","a");
        m2.put("z","z");
        m2.put("d","d");
        m2.put("b","b");
        Iterator<Map.Entry> i2 = m2.entrySet().iterator();
        while (i2.hasNext()){
            Map.Entry entry = i2.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
