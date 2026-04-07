package Day14;
import java.util.*;
public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Apple");  
        System.out.println("Sorted TreeSet: " +ts);
        System.out.println("First element: " +ts.first());
        System.out.println("Last element: " +ts.last());


        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(15);
        set.add(8);
        set.add(12);
        System.out.println("Sorted TreeSet: " +set);

        TreeSet<Integer> s=new TreeSet<>();
        s.add(10);   
        s.add(15);
        s.add(10);
        s.tailSet(5);
        s.headSet(5);
        System.out.println(s);
    }
}

