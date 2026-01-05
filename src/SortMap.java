import java.util.*;
import java.util.stream.Collectors;

public class SortMap{


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> sortedMap = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        map.put("Abhinav", 2);
        map.put("Abhi", 4);
        map.put("Tiwari", 7);
        map.put("John", 6);
        map.put("Alex", 9);

//sort using Streams.
HashMap<String,Integer> sortedMap1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2)-> e2, LinkedHashMap::new));
//        Step-by-step explanation:
//
//        map.entrySet().stream():
//        Converts the entries (key-value pairs) of the original map (which is a HashMap<String, Integer>) into a stream for processing.
//.sorted(Map.Entry.comparingByValue()):
//        Sorts the stream of entries based on their values in ascending order (using the values of the map).
//.collect(Collectors.toMap(..., ..., ..., ...)):
//        Collects the sorted entries into a new map using Collectors.toMap(...) with the following parameters:
//        Map.Entry::getKey: Specifies that the key for the new map will come from the entry's key.
//        Map.Entry::getValue: Specifies that the value for the new map will come from the entry's value.
//        (e1, e2) -> e2: A merge function to resolve key collisions, but collisions cannot happen here because stream provides unique keys; it picks the second value if a collision occurs.
//                LinkedHashMap::new: Specifies that the result should be a LinkedHashMap, which preserves the insertion order (so the map stays sorted by value).
//        Important note:
//        Although the variable type is declared as HashMap<String, Integer>, the code will actually produce a LinkedHashMap to preserve the sorted order. Assigning the result to a HashMap reference technically works (because it’s a Map), but it’s better practice to use Map<String, Integer> or LinkedHashMap<String, Integer> as the type. Otherwise, this may cause confusion or errors with type expectations.
//
//        What does this code achieve?
//        It creates a new map (sortedMap1) that contains all the entries from the original map, sorted by their values in ascending order, and preserves this order.
//


        System.out.println(sortedMap1);

        //sort by Keys.
        TreeMap<String, Integer> tm = new TreeMap<>(map);
        System.out.println(tm);

        sortedMap = sortByValue(map);

        for (Map.Entry<String, Integer> mm : sortedMap.entrySet()) {
            System.out.println(mm.getKey() + "--" + mm.getValue());
        }
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> m : list) {
            temp.put(m.getKey(), m.getValue());
        }
        return temp;
    }

}
