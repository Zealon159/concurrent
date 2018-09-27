package cn.zealon.java8.ch2;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Zealon
 * @Date: 2018-09-03 15:41
 */
public class HashMapCase {
    public static void main(String[] args){
        Map map = new HashMap(1);
        map.put("a","a");
        map.put("b","b");
        map.put(null,"c");
        map.put(null,"d");

        map.remove(null);
        System.out.println(map.get(null));


    }
}
