package javaexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReadTwoFilesSumWriteToFile {

    public static void main(String[] args) throws Exception{

        PrintWriter pw = new PrintWriter(new File("finalNumbers.txt"));

        BufferedReader inputStream = new BufferedReader(new FileReader(
                "numbers1.txt"));
        String count;
        while ((count = inputStream.readLine()) != null) {
            System.out.println(count);
            pw.write(count);
        }
        pw.write(" ");

        BufferedReader inputStream1 = new BufferedReader(new FileReader(
                "numbers2.txt"));
        String count1;
        while ((count1 = inputStream1.readLine()) != null) {
            System.out.println(count1);
            pw.write(count1);
        }
        pw.close();
    }
}
