package javatest;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("testout.txt");
            String s = "Welcome to javaTpoint.";
            byte b[] = {112,64,68};//converting string into byte array
           // System.out.print(b.toString());
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
