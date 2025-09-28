package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExmp3 {
    public static void main(String[] args) {
        String path1 = "D:\\ReactProject\\data.txt";
        String path2 = "D:\\ReactProject\\database.txt";

        try{
            FileReader fr =  new FileReader(path1);
            FileWriter fw = new FileWriter(path2);
            int c = fr.read();
            while (c != -1){
                fw.write(c);
                c = fr.read();
            }
            fw.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
