package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExmp2 {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";
        try{
            FileReader fr = new FileReader(path);
            int c = fr.read();
            while (c != -1){
                System.out.print((char) c);
                c = fr.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*reading text from data.txt file

Hello
how are you?
what is your age?
 */