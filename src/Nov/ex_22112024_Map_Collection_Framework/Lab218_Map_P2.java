package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab218_Map_P2 {
    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<String,Integer>();
//        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map=new HashMap();

//        Map map=new HashMap();
        map.put("id",1);
//        map.put("id",1);
        map.put("id2",32);
        map.put("id3",32);
        map.put("id4",null);
        map.put("id5",null);
//        map.put("null",null);
        map.put(null,null);
        map.put(null,105);
        map.put(null,106);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(null));
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(null));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("null value "+map.get(null));

        Map map1=new HashMap();
//        map1.put("null",null);
//        map1.put(null,null);
        System.out.println("null map "+map1.isEmpty());

    }
}
