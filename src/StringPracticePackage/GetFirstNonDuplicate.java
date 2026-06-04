package StringPracticePackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class GetFirstNonDuplicate {

    public static void main(String[] args) {

        String str  = "test";

        List<String> list = List.of(str.split(""));
        LinkedHashSet<String> lh = new LinkedHashSet<>(list);

        for(String s : list){
            if(Collections.frequency(list,s) >1){
                lh.remove(s);
                System.out.println(lh.getFirst());
                break;
            }
        }

    }
}
