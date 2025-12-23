import java.util.*;

public class ArraytoListToArray {


    public static void main(String[] args) {


        List<String> listArray = new ArrayList<String>();
        listArray.add("ABhinav");
        listArray.add("ABhinav1");
        listArray.add("ABhinav2");
        listArray.add("ABhinav3");


        int atr[] = {1,2,3,3};
        String[] strArray = listArray.toArray(new String[0]);

        for(String s: strArray) {
            System.out.println("Array -----  "+s.toString());
        }

        ListIterator<String> con = (ListIterator<String>) Arrays.asList(strArray).iterator();
        while(con.hasNext()){
            System.out.println("List ---   "+ con.next());
        }

        while(con.hasPrevious()){

        }



    }
}
