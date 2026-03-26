package Day7;

class parent{
    void display(){
        System.out.println("i am inside parent class  but called by parent class");

    }
    void greet(){
        System.out.println("hello");
    }
}

class child extends parent{
    void display1(){
        System.out.println("  i am inside child class ");
    }
    void greet1(){
        System.out.println("hello from child class");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("inside main function ");
        child c= new child();
        c.display();
        c.display1();

        parent p= new child();
        p.greet();
        //p.greet1(); // this will give error because parent class reference cannot access child class method
    }
}
