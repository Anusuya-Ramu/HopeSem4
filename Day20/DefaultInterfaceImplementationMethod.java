package Day20;
import java.util.*;
interface method{
    default void display(){
        System.out.println("welcome to interface method");
    }
}
class hello implements method{
    public void display(){
        System.out.println("Overrided the interface method implementation.");
    }
}

public class DefaultInterfaceImplementationMethod {
    public static void main(String[] args) {
        hello h = new hello();
        h.display();
    }
}