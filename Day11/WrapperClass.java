package Day11;
public class WrapperClass{
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Integer objA=Integer.valueOf(a); //10 //autoboxing
        System.out.println(objA);
        System.out.println(a== objA); //true because of autoboxing
        System.out.println(objA.equals(a)); //true because of autoboxing

       // System.out.println(a.hashCode()); //10 //primitive data type doesn't have hashcode method
        System.out.println(objA.hashCode()); //10 



        Character ch='a';
        System.out.println(ch);
        System.out.println(ch.hashCode()); //65

        char c=ch.charValue(); //autoboxing
        System.out.println(c);

    }
}