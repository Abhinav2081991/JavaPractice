package SerializationPractice;

import java.awt.*;
import java.io.*;

public class SerializationFile implements Serializable {


// Code to byte Stream (file)
    public static void serializable(Object object, String fileName) throws IOException {

        FileOutputStream file  = new FileOutputStream(fileName);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(object);
        obj.close();
        file.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Rectangle rect = new Rectangle();
        rect.height = 10;
        rect.width = 5;
        serializable(rect, System.getProperty("user.dir")+"//Serializedfile.txt");

        Rectangle rect2 = (Rectangle) deserialize(System.getProperty("user.dir")+"//Serializedfile.txt");
        System.out.println(rect2.height);
        System.out.println(rect2.width);

    }


    // File to code. Deserialize
    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream objectStream = new ObjectInputStream(file);
        Object obj = objectStream.readObject();
        objectStream.close();
        file.close();
        return obj;

    }
}
