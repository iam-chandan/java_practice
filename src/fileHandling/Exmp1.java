package fileHandling;

import java.io.File;

public class Exmp1 {
    public static void main(String[] args) {
        String path = "D:\\ReactProject\\data.txt";
        File file = new File(path);
        System.out.println("is it exists : " + file.exists());
        System.out.println("can read : " + file.canRead());
        System.out.println("can write : " + file.canWrite());
        System.out.println("name of the file : " + file.getName());
        System.out.println("name of the file's parent : " + file.getParent());
        System.out.println("absolute path of the file : " + file.getAbsolutePath());
        System.out.println("absolute file of the file : " + file.getAbsoluteFile());
        System.out.println("absolute file of the file : " + file.getAbsoluteFile());
        System.out.println("is file : " + file.isFile());
        System.out.println("is directory : " + file.isDirectory());
    }
}
/*
is it exists : false
can read : false
can write : false
name of the file : data.txt
name of the file's parent : D:\ReactProject
absolute path of the file : D:\ReactProject\data.txt
absolute file of the file : D:\ReactProject\data.txt
absolute file of the file : D:\ReactProject\data.txt
is file : false
is directory : false
 */