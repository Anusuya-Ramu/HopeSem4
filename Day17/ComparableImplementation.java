package Day17;
import java.util.*;
class student implements Comparable<student>{
    int rollno;
    String name;

    student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    @Override
    public int compareTo(student s){
        //return s.name.compareTo(this.name); //big to small(alphabetically)
        return this.name.compareTo(s.name); // small to big(alphabetically) (A to Z) then (a to z)
       // return s.rollno - this.rollno; // big to small
       // return this.rollno - s.rollno; // small to big
    }
}
public class ComparableImplementation {
    public static void main(String[] args) {
        List<student> l = new ArrayList<>();
        l.add(new student(10,"john"));
        l.add(new student(5,"alice"));
        l.add(new student(16,"Bob"));
        l.add(new student(3,"Chef"));
        Collections.sort(l);
        for(student s:l){
            System.out.println(s.rollno+" "+s.name);
        }
    }
}
