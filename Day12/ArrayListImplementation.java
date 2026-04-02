package Day12;

import java.util.*;

public class ArrayListImplementation {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();

        //List<Integer> list = new ArrayList<>();
        arrList.add(null);
        arrList.add(10);
        arrList.add(20);
        arrList.add(0, 15);
        arrList.add(10);
        System.out.println(arrList);

        arrList.set(1,5 );
        System.out.println(arrList);

        arrList.remove(1);

        System.out.println(arrList);
        System.out.println(arrList.contains(15));
        System.out.println(arrList.contains(100));
        System.out.println(arrList.size());
        System.out.println(arrList.indexOf(0));
        System.out.println(arrList.lastIndexOf(0));
        System.out.println(arrList.isEmpty());
        
        arrList.clear();

        System.out.println(arrList.isEmpty());
    }
}