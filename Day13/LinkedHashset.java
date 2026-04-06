package Day13;

import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
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
