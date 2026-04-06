package Day13;

import java.util.*;

public class SetImplementation {
    public static void main(String[] args) {
       /*Set<Integer> set = new HashSet<>();
       set.add(1);
       System.out.println(set);
       set.add(2);
       System.out.println(set); 
       System.out.println(set.contains(2)); */

       Set<String> s = new HashSet<>();
       s.add("ra");
       System.out.println(s);
       s.add("an");
       System.out.println(s);
       s.add("bbb");
       s.add("cc");
       s.add("dd");
       s.add(" ");// null can be added
       System.out.println(s);

    }
    
}
