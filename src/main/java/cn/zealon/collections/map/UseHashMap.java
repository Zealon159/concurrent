package cn.zealon.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class UseHashMap {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap();
        map.put("1","2");
        map.size();

        map.hashCode();
    }
}
