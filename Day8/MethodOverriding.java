package Day8;

class Parent {
    public void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("This is Child class method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();  // Upcasting
        obj.show();  // This will call the show method of Child class due to method overriding
    }
}
