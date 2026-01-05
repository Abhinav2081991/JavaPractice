package StringPracticePackage;

import java.io.*;

public class ReadFromTextFile {


    public static void main(String[] args) throws IOException {


        FileReader file =  new FileReader(System.getProperty("user.dir")+ "\\TestFile.txt");
        BufferedReader br = new BufferedReader(file);
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line.contains("test"));
        }

    }
}
