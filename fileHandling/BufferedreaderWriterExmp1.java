package fileHandling;

import java.io.*;

public class BufferedreaderWriterExmp1 {
    public static void main(String[] args) {
        String path1 = "D:\\ReactProject\\name.txt";
        String path2 = "D:\\ReactProject\\phoneNumber.txt";
        String path3 = "D:\\ReactProject\\phone_book.txt";

        /*
        merging name.text data and phoneNumber.txt data into phone_book.txt
         */

        try{
            FileReader fr1 = new FileReader(path1);
            BufferedReader br = new BufferedReader(fr1);

            FileReader fr2 = new FileReader(path2);
            BufferedReader br2 = new BufferedReader(fr2);

            FileWriter fw = new FileWriter(path3);

            String name = br.readLine();
            String phone = br2.readLine();
            while (name != null && phone != null){
                fw.write(name + " : " + phone + "\n");
                name = br.readLine();
                phone = br2.readLine();
            }
            fw.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
