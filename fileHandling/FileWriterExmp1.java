package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExmp1 {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";
        File file = new File(path);

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello world");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
