package Day18;
import java.io.*;

public class BufferWriterImplementation {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Hope_Batch1.txt", true)); // 'true' for appending to the file
            bw.newLine(); // To add a new line before appending new content
            bw.write("Here we have turned the file writer with true to append the data in the file");
            bw.newLine(); // To add a new line
            bw.write("finally i have closed the appending and writing operation. Now , i  am closing the buffer writer.");
            bw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
