package Day8;

class Methods {

    public static void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    public static void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    public static void add(String a, String b) {
        System.out.println("Concatenation: " + (a + b));
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("method overloading example");
        Methods.add(10,20);
        Methods.add(10.5,20.5);
        Methods.add("Hello ","Hope batch 1");
    }
}
