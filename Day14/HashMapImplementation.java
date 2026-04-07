package Day14;
import java.util.*;
public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("hello", null);
        System.out.println(map.get("hello"));
        map.put("hello",1);
        System.out.println(map.get("hello"));
        System.out.println(map.getOrDefault("aaa",2));
        map.put("aaa",9);
        System.out.println(map.get("aaa"));
    }
}
