package Day18;
import java.util.*;
import java.io.*;


public class FileWriterImplementation {
    public static void main(String[] args) {
        try{
            FileWriter fw= new FileWriter("Hope_Batch1.txt");
            fw.write("welcome to file handling \n this is batch one");
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
