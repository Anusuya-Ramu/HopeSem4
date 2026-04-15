package Day18;
import java.util.*;
import java.io.*;

public class FileReaderImplementation {
    public static void main(String[] args) {
        try{
            FileReader fr= new FileReader("Hope_Batch1.txt");
            int i;
            while((i=fr.read())!=-1){//it reads only integer value and returns -1 when it reaches end of file
                System.out.print((char)i);
            }
            fr.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}