package EnumPractice;


import java.util.EnumMap;
import java.util.EnumSet;

enum Days{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
public class EnumPractice {


    public static void main(String[] args) {

        EnumSet enumSet = EnumSet.allOf(Days.class);

        System.out.println(enumSet);

            EnumMap<Days,String> enumMap = new EnumMap<Days, String>(Days.class);
            enumMap.put(Days.Saturday, "Weekend1");
            enumMap.put(Days.Friday, "Weekend0");
            enumMap.put(Days.Sunday, "Weekend2");
            enumMap.put(Days.Monday, null);

        System.out.println(enumMap);

    }
}
