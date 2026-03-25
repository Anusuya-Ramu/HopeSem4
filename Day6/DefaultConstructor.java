package Day6;
class dConstructor{
    dConstructor(){
        System.out.println("i am inside parameterized default constructor");
    }
    int x=10;
}
class ParameterizedConstructor{
    int x;
    ParameterizedConstructor(int a){
        this.x = a; // x=a
        System.out.println("i am inside parameterized constructor");
        System.out.println("value of a is "+a);
    }
}

public class DefaultConstructor {
    DefaultConstructor(){
        //System.out.println("i am inside default constructor");
    }
    public static void main(String[] args) {

        System.out.println("see ur default constructor .");
        dConstructor obj = new dConstructor();
       System.out.println(obj);
       System.out.println(obj.x);

         ParameterizedConstructor obj1 = new ParameterizedConstructor(20);
        System.out.println(obj1);
    }
}
