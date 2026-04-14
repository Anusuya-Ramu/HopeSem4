package HolidayTask2.LRU.main;
import HolidayTask2.LRU.service.*;
import HolidayTask2.LRU.util.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();

        LRUCache cache = new LRUCache(capacity);

        while (true) {
            System.out.println("\n1. PUT\n2. GET\n3. EXIT");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter key and value: ");
                int key = sc.nextInt();
                int value = sc.nextInt();
                cache.put(key, value);

            } else if (choice == 2) {
                System.out.print("Enter key: ");
                int key = sc.nextInt();
                System.out.println("Value: " + cache.get(key));

            } else if (choice == 3) {
                break;
            }
        }

        CachePrinter.print(cache.getHead(), cache.getTail());
        sc.close();
    }
}