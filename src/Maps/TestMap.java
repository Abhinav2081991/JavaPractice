package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TestMap {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);
        map.put(6, null);

        System.out.println(map);
        // Output - {1=null, 2=null, 3=null, 4=null, 5=null, 6=null}

        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        treemap.put(1, "Abhi");
        treemap.put(2, "null");
        treemap.put(3, "ab");
        treemap.put(4, "hh");
        treemap.put(5, "as");
        treemap.put(6, "asd");

        System.out.println(treemap);


        System.out.println(treemap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));




    }
}
