package Day11;
public class Autoboxing {
    public static void main(String[] args) {
        int a=10;
        Integer objA=a; //10 //autoboxing
        System.out.println(objA);
        System.out.println(objA == a); //true because of autoboxing
        System.out.println(objA.equals(a)); //true because of autoboxing

        Integer b=1000;
        Integer objB=1000; //1000 //autoboxing
        System.out.println(objB == b); //false 
        System.out.println(objB.equals(b)); //true because of autoboxing

        Character ch='a';
        Character bch='a'; //autoboxing
        System.out.println(bch == ch);
    }
}