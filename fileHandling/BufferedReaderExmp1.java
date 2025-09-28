package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExmp1 {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";

        try{
            FileReader fr =  new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
