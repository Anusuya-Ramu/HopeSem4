package Day1;

public class primitive {
    public static void main(String[] args) {
        byte a=-128;
        byte b=127;
        System.out.println("The Byte range "+ a+" "+b);
        short s1=-10000;
        short s2=9999;
        System.out.println("The short  range "+s1+" "+s2);
        int i=-1000000000;
        int j=999999999;
        System.out.println("The int range "+i+" "+j);
        long l1=-100000000000000L;//250L
        long l2=999999999999999999L; // 230L
        System.out.println("The long range "+l1+" "+l2);
        float f1=2.3f;
        float f2=3.45f;
        System.out.println("The float range "+f1+" "+f2);
        double d1=2.3;
        double d2=3.45;
        System.out.println("The double range "+d1+" "+d2);
        boolean bo1=true;
        boolean bo2=false;
        System.out.println("The values of boolean is"+bo1+" "+bo2);
        char ch='%';
        System.out.println("The character is "+ch );      
    }
}
