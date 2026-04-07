package Day14;
import java.util.*;
public class FrequencyUsingMap {
    public static void main(String[] args) {
        Map<Character,Integer> f = new HashMap<>();
        String s = "aazzzbbbcc";
        for (char c : s.toCharArray()) {
            f.put(c, f.getOrDefault(c, 0) + 1);
        }
        System.out.println(f);
        System.out.println("only values:");
        System.out.println(f.values());
        System.out.println("only keys:");
        System.out.println(f.keySet());
        System.out.println("entry set:");
        for(Map.Entry<Character,Integer> e : f.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
