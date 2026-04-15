package Day18;
import java.util.*;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try{
            File f= new File("Hope_batch1.txt");
            if(f.createNewFile()){
                System.out.println("file created"+ f.getName());
            }else{
                System.out.println("file already exist");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}