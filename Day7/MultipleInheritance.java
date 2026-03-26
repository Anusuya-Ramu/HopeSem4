package Day7;

class vehicle{
    void display(){
        System.out.println("there are multiple vehicles choose one and mention its sound");
    }
}
class car extends vehicle{
    void use(){
        System.out.println("car for family use and long distance travel");
    }
}

class bike extends vehicle{
    void use(){
        System.out.println("bike for personal use and delivery");
    }
}

class bus extends vehicle{
    void use(){
        System.out.println("bus for public transport and school/ clg");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        car c=new car();
        c.display();
        c.use();
        bike b= new bike();
        b.display();
        b.use();
        bus bs= new bus();
        bs.display();
        bs.use();   
    }
}
