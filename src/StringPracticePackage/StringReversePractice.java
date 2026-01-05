package StringPracticePackage;

import java.sql.*;
import java.util.*;

public class StringReversePractice {

    public static void main(String[] args) {

        String input = "Abhinav Tiwari is a very good programmer";
        String[] strArray = input.split("");
        String output = "";
        for(int i = strArray.length-1; i>=0;i--){

            output = output+strArray[i];
        }
        System.out.println(output);


        reverseWord("Abhinav Tiwari is a very good programmer");

//        reverseWord2("Abhinav Tiwari is a very good programmer");


        String s1 = new String("digitalocean");
        String s2 = new String("DIGITALOCEAN");
        System.out.println(s1 = s2); /// this will print DIGITALOCEAN

        foo(null);

    }

    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {
        System.out.println("String argument");
    }


    public static void reverseWord(String input){

        String[] strArray = input.split(" ");
        String output = "";
        for(String s : strArray){
            char[] c =s.toCharArray();
            for(int i=c.length-1; i>=0;i--){
                output = output+c[i];
            }
            output = output +  " ";
        }
        System.out.println(output);

    }

//    public static void reverseWord2(String input){
//
//        String output = "";
//        List list = Arrays.asList(input.split(" "));
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);
//
//    }


//    public static void connectToDb() throws ClassNotFoundException, SQLException {
//
//
//
//        Class.forName("");
//        Connection con  = DriverManager.getConnection("");
//        Statement stmt = con.createStatement();
//        PreparedStatement p = con.prepareStatement("select * from tablename where a=?, b=?, c=?");
//
//                p.setString(1, "Test");
//        p.setString(2, "Test");
//        p.setString(3, "Test");


//        ResultSet r =  p.executeQuery();
//        while(r)

//        ResultSet result  = stmt.executeQuery("");
//
//        stmt.e
//
//        while(result.next()){
//            result.getString("")
//        }







//    }


}
