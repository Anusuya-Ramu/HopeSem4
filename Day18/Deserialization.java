package Day18;
import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("confidential.dat"));
        student s=(student) ois.readObject();
        ois.close();
        System.out.println("after deserialization data is : ");
        System.out.println(s.id + " "+ s.name);
    }
}
