package cn.zealon.collections.map;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class UseHashMap {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap(11,1);
        map.put("1","2");
        map.put("",null);
        map.put(null,null);
        map.size();


        map.hashCode();

        Map<String,Object> a = new HashMap<>();

        System.out.println(1 << 30);

        Set<Map.Entry<String, Object>> sets = map.entrySet();
        sets.iterator();

        HashSet<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();

        Hashtable<String,Object> hashtable = new Hashtable<>();
        //hashtable.put("a","");
        //hashtable.put("a1","23");
        System.out.println(hashtable.size());
        System.out.println(hashtable.get("a"));

    }
}
