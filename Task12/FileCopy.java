package Task12;
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try{
            File f= new File("Hope_Batch1.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("welcome to file handling \n this is batch one");
            fw.close();
            FileInputStream fis = new FileInputStream("Hope_Batch1.txt");
            FileOutputStream fos = new FileOutputStream("Hope_Batch1_copy.txt");
            int i;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
            fis.close();
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
