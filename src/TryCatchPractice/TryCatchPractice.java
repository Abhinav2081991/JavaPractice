package TryCatchPractice;

import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchPractice {


    public static void main(String[] args) throws IOException {


        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ABHINATI\\Documents\\Personal\\JavaPractice\\Javapractice\\TestFile.txt")))
        {
            int i = 1/0;
            System.out.println(br.ready());
        }



    }
}
