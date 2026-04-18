package Day20;
import java.util.*;

class bank {
    int balance = 1000;
    public void run(){
        withdraw(600);
    }
    void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" "+ "is withdrawing...");
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }
}
public class concurrencyImplementation{
    public static void main(String[] args) {
        bank b = new bank();
        Runnable task= () -> {
            b.withdraw(200);
        };
        Thread t1 = new Thread(task, "user 1");
        Thread t2 = new Thread(task, "user 2");
        t1.start();
        t2.start();
    }
}