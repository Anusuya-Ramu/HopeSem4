package HolidayTask2.LRU.util;
import HolidayTask2.LRU.model.*;

public class CachePrinter {
    public static void print(Node head, Node tail) {
        Node temp = head.next;
        System.out.println("Final cache (MRU → LRU):");

        while (temp != tail) {
            System.out.print("[" + temp.key + "=" + temp.value + "] ");
            temp = temp.next;
        }
        System.out.println();
    }
}