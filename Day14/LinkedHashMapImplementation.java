package Day14;
import java.util.*;
public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();// non primitive data type
        map.put(3,"Three");
        map.put(1,"one");
        map.put(2,"two");
        System.out.println("Linked HashMap: " + map);
    }
}
