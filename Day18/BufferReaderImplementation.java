package Day18;
import java.io.*;

public class BufferReaderImplementation {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("Hope_Batch1.txt"));
            while(br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
