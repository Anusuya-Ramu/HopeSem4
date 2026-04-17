package Day19;
import java.util.*;

class music extends Thread{
    void song(){
        System.out.println("Playing music...");
    }
}

class timer extends Thread{
    void time(){
        System.out.println("Timer started...");
    }
}

public class ThreadImplementation {
    public static void main(String[] args) {
        Thread m = new music();
        Thread t = new timer();
        m.start();
        t.start();
    }
}
