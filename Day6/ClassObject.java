package Day6;


class Apart{
    void display(){
        System.out.println("i am inside Apart class object");
    }     
}

public class ClassObject {
    public static void main(String[] args) {

        System.out.println("i am inside classobject");// static create object for this 2 

        Apartment apt = new Apartment();
        apt.display();
        // Creating an object of the class
        //ClassObject obj = new ClassObject();
        //System.out.println("Object created: " + obj);


        Apart obj1 = new Apart();
        obj1.display();
    }
}
