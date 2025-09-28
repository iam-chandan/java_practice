package fileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExmp {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";
        Scanner scn = new Scanner(System.in);

        /*
        if we use PrintWriter then it wont convert input data to char/string it will store as it is not like BufferedReader
         */

        try {
            PrintWriter pw = new PrintWriter(path);
            float f = scn.nextFloat();
            int i = scn.nextInt();
            pw.println(f);
            pw.println(i);
            pw.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
