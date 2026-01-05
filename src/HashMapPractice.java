import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {

    public static void main(String args[]){


//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1,"Abhinav");
//        map.put(2,"Tiwari");
//        map.put(3,"is");
//        map.put(4,"a good programmer");
//
//        System.out.println(map);
//
//      for(Map.Entry m : map.entrySet()){
//            System.out.println(m.getKey()+"--"+m.getValue());
//        }
//    String a = "";
//        Iterator i = map.entrySet().iterator();
//        while (i.hasNext()){
//
//            a= a+i.next().toString();
//        }
//        System.out.println(a);

        freqOfChars("ldskjsl kdja lsj dlka");


    }

    public static void freqOfChars(String input){
         //uuaahhhhllllwwwwww
        String[] strArray = input.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : strArray){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        System.out.println(map);
        for(Map.Entry m : map.entrySet()){
            System.out.println("Count of Characters " + m.getKey() + " is - " + m.getValue());
        }
    }

}
