import java.util.Arrays;

public class SortIntegerArray {


    public static void main(String[] args) {


        int[] ts = {7, -1, 6, 10, -10};

        for(int s : ts) {
            System.out.println(s);
        }

        Arrays.sort(ts);

        for(int s : ts) {
            System.out.println(s);
        }
    }

}
