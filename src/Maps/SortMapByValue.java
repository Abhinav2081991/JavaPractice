package Maps;

import javax.lang.model.type.IntersectionType;
import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("Abhinav", 4);
        hm.put("Tiwari", 6);
        hm.put("Rama", 2);
        hm.put("Jugal", 3);
        hm.put("Anshita", 7);
        hm.put("Vidharth", 1);


        System.out.println(hm);


        Map<String, Integer>  map = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry :: getValue, ((i1,i2 )-> i1), LinkedHashMap::new ));

        Map<String,Integer> sortedMap =
                hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,((integer, integer2) -> integer2), LinkedHashMap::new));

        System.out.println(sortedMap);












        LinkedHashMap<String, Integer> l = hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,((i1, i2) ->i1), LinkedHashMap::new));



    }
}
