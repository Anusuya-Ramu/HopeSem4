package Day8;

class encapsulation {
    int a;
    encapsulation(int b){
        a=b;
    }

    void display(){
        System.out.println("implementation of encapsuation "+a);
    }
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulDemo {
    public static void main(String[] args) {
        encapsulation e = new encapsulation(10);
        e.display();
        e.setName("Anusuya");
        e.setAge(21);
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());

    }
}
