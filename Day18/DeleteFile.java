package Day18;
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("Hope_Batch1.txt");
        try {
            if(f.delete()){
                System.out.println("deletion successful");
            }else{
                System.out.println("deletion unsuccessful");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
