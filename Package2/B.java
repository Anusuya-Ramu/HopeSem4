package Package2;
import Package1.*;

public class B extends A {
    public static void main(String[] args) {
        A objA = new A();
        objA.display(10); // This will cause a compile-time error because display() is protected and B is in a different package.
        
        B objB = new B();
        objB.display(10);
    }
}

