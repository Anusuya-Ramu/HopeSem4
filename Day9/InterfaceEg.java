package Day9;

interface A{
    void show();
}
interface B{
    void display();
}
class C implements A{
    public void show(){
        System.out.println("show method of interface A");
    }
}
class D implements B{
    public void display(){
        System.out.println("display the method of B");
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        A a= new C(); 
        a.show();

        B b= new D();
        b.display();
       
       
        C c= new C();
        c.show();
        D d= new D();
        d.display();
    }
}
