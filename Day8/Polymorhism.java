package Day8;

class animal {
    public void sound(){
        System.out.println("animal always make sound");
    }
}

class dog  extends animal{
    public void sound(){
        super.sound();
        System.out.println("dog barks");
    }
}

class cat extends animal{
    public void sound(){
        super.sound();
        System.out.println("cat meows");
    }
}

class tiger extends animal{
    public void sound(){
        System.out.println("tiger growls");
    }
}

public class Polymorhism {
    public static void main(String[] args) {
        animal a;
        a=new cat();
        a.sound();  

        a=new dog();
        a.sound();

    }
}
