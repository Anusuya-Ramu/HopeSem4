package Day18;
import java.util.*;
import java.io.*;

class student implements Serializable{
    int id;
    String name;
    public static String val= "hello";
    public student(int id , String name){
        this.id=id;
        this.name=name;
    }
}
public class Serialization {
    public static void main(String[] args)throws Exception {
        student s= new student(1009, "aaa");
        ObjectOutputStream oos = new ObjectOutputStream(new  FileOutputStream("confidential.dat"));
        oos.writeObject(s);
        oos.close();
        student.val="hi";
        System.out.println(student.val);
        System.out.println("object is serialized");
    }
}
