package fileHandling;

import java.io.*;
import java.util.Scanner;

public class BufferedWriterExmp {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";

        Scanner scn = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            int n = scn.nextInt();
            bw.write(n); // here automatically int will convert to char/string
            bw.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
