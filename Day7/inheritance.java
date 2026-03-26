package Day7;

class animal{
    void display(){
        System.out.println("there are multiple animals choose one and mention its sound");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks");
    }
}


public class inheritance {
    public static void main(String[] args) {
       /*  animal a= new animal();
        a.display();

        dog d= new dog();
        d.bark();*/

        dog sound= new dog();
        sound.bark();
        System.out.println(sound.hashCode());
    }
}
