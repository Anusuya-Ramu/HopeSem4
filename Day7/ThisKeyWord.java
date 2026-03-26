package Day7;

class nameAndRoll{
    String name;
    int roll;
    nameAndRoll(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println("name is "+name);
        System.out.println("roll no is "+roll);
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {
        nameAndRoll n = new nameAndRoll("Alice", 10);
        n.display();
        System.out.println(n.hashCode());

        nameAndRoll n2 = new nameAndRoll("Alice", 678);
        n2.display();
        System.out.println(n2.hashCode());

        nameAndRoll n3 = new nameAndRoll("Alice", 67899);
        n3.display();
        System.out.println(n3.hashCode());
    }
}