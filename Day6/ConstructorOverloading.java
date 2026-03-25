package Day6;

class  crOverloading {
    crOverloading(){
        System.out.println("constructor overloading with no argument");
    }
    crOverloading(int i){
        System.out.println(" parameterized constructor overloading with single argument " + i);
    }
    crOverloading(boolean b){
        System.out.println(" parameterized constructor overloading with  single argument " + b);
    }
    crOverloading(String i){
        System.out.println(" parameterized constructor overloading with  single argument " + i);
    }
    
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("constructor overloading example");
        crOverloading cr1 = new crOverloading();
        crOverloading cr2 = new crOverloading(10);
        crOverloading cr3 = new crOverloading(true);
        crOverloading cr4 = new crOverloading("Hope batch 1");
       // crOverloading cr5 =new crOverloading("Hope batch 3");
    }
}
