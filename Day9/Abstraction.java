package Day9;
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("eating ....");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("barks....");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("meows....");
    }
}

public class Abstraction {
    public static void main(String[] args) {
       // Animal a= new Animal() { };// can not instantiate the type animal
       
        Animal a= new dog();
        a.eat();
        a.sound();

        Animal a1 = new cat();
        a1.sound();

        
    }
}
