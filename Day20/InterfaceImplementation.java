package Day20;
import java.util.*;

interface Test{
    public void show();
}
interface Add{
    public void show(int a , int b);
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        Test t = () -> System.out.println("Hello, this is a lambda expression implementing the show method.");
        t.show();
        Add t1 = (a,b) -> System.out.println("Hello Lambda interface add: " + (a+b));
        t1.show(5, 10);
    }
}
