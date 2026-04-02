package Day12;

import java.util.*;

public class LinkedListImplementation {
    public static void main(String[] args) {

        List<String> runningRace = new LinkedList<>();

        runningRace.add("A");
        runningRace.add("B");
        runningRace.add("C");

        runningRace.addFirst("Start Race");
        System.out.println(runningRace);
        runningRace.remove(2);
        System.out.println("B is disqualified due to early start");
        System.out.println(runningRace);
        runningRace.addLast("Finish Line");
        
        System.out.println("A won in 0.001 milliseconds");

    }
}