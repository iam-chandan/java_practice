package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExmp2 {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";
        Scanner scn = new Scanner(System.in);
        /*
        instade of creating File class object directly passed path to FileWriter
         */
        try{
            //FileWriter fw = new FileWriter(path); // will override the text
            FileWriter fw = new FileWriter(path,true); // will append the text rather override
            String st1 = scn.next();
            String st2 = scn.next();
            String st3 = scn.next();
            fw.write(st1);
            fw.write(st2);
            fw.write(st3);
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
