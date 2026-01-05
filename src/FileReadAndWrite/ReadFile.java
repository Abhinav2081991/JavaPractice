package FileReadAndWrite;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        FileReader f1 = new FileReader("/Users/Abhinav/Documents/Personal/AutomationPractice/JavaPractice/GITDEMOPRACTICE/TestFile.txt");
        BufferedReader br = new BufferedReader(f1);
        String line = br.readLine();
        while (br.readLine() !=null){
            System.out.println(br.readLine());
        }

        FileWriterMethod();
    }



    public static void FileWriterMethod() throws IOException {

        FileWriter f1 =
                new FileWriter("/Users/Abhinav/Documents/Personal/AutomationPractice/" +
                        "JavaPractice/GITDEMOPRACTICE/TestFileWrite.txt", true);
        BufferedWriter bw = new BufferedWriter(f1);
        bw.write("Hello Java");
        bw.newLine();
        bw.write("sdasdjhaskj");
        System.out.println("Written");

    }
}

