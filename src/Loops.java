public class Loops {

    public static void main(String[] args){

        int a = 10;
        int b  = 20;
        System.out.println((a>b)?"a smaller than b - true":"a greater than b - false");
        // example of ternary operator

        test1:  // named for loop
        for(int i = 0; i<= 10;i++){

            if(i==5)
                continue;
            System.out.println("value of i is -- " +i);

        }
        test:
        for(int j = 0; j<= 10;j++){

            if(j==5)
                break;
            System.out.println("value of j is -- " +j);

        }


    }
}
