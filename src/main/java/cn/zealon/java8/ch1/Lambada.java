package cn.zealon.java8.ch1;

import java.util.*;
import java.util.function.Consumer;

/**
 * @auther: Zealon
 * @Date: 2018-08-29 10:08
 */
public class Lambada {
    public static void main(String[] args){
        /*List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println(names.toString());*/

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(
                    System.out::println
                );


        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> sayHi(val));

    }

    public static void sayHi(String val){
        System.out.println(""+val);
    }
}
