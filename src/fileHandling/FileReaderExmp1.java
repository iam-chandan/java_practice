package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExmp1 {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";
        try{
            FileReader fr = new FileReader(path);
            char[] arr = new char[25];
            System.out.println(fr.read(arr));
            System.out.println(arr);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
21
hellohowarehowareyou?
 */