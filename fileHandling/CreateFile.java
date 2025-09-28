package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        /* creating file */
        String path = "D:\\ReactProject\\database.txt";
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        /* creating directory/folder */
        String path1 = "D:\\ReactProject\\database";
        File file1 = new File(path1);

        file1.mkdir();

    }
}
