package Task12;
import java.io.*;

public class FileRename {
    public static void main(String[] args) {

        try {
            File file = new File("demo.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
            File newFile = new File("RenamedFile.txt");
            if (file.renameTo(newFile)) {
                System.out.println("File renamed successfully");
            } else {
                System.out.println("File rename failed");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}