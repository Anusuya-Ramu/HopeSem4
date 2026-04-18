package Day20;
import java.util.*;
public class sortingLambda {
    public static void main(String[] args) {
        String[] s1= { "pencil", " pen", " eraser", " sharpener" };
        Arrays.sort(s1);
        System.out.println(Arrays.toString(s1));
        Arrays.sort(s1, (a, b) -> a.compareTo(b)); // (a,b)-> b.compareTo(a) for reverse order
        System.out.println(Arrays.toString(s1));

        String[] s= { " cake", " apple", " banana", " orange" ,"cat"};
        Arrays.sort(s, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(s));
        Arrays.sort(s, (a, b) -> b.compareTo(a)); // for reverse order
        System.out.println(Arrays.toString(s));

        List<String> list = Arrays.asList("dog", "cat", "ant", "elephant");
        list.sort((a, b) -> a.compareTo(b)); // (a,b)-> b.compareTo(a) for reverse order
        System.out.println(list);
        list.sort((a, b) -> b.compareTo(a)); // for reverse order
        System.out.println(list);

        list.sort(String::compareTo); // method reference for natural order
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // using Comparator for reverse order
        System.out.println(list);

    }
}
