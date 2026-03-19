package Task2;
import java.util.Scanner;
public class Leetcode2525 {
    /*Given four integers length, width, height, and mass, representing the dimensions and mass of a box, respectively, return a string representing the category of the box.

The box is "Bulky" if:
Any of the dimensions of the box is greater or equal to 104.
Or, the volume of the box is greater or equal to 109.
If the mass of the box is greater or equal to 100, it is "Heavy".
If the box is both "Bulky" and "Heavy", then its category is "Both".
If the box is neither "Bulky" nor "Heavy", then its category is "Neither".
If the box is "Bulky" but not "Heavy", then its category is "Bulky".
If the box is "Heavy" but not "Bulky", then its category is "Heavy". */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len= sc.nextInt();
        int wid= sc.nextInt();
        int hei= sc.nextInt();
        int mass= sc.nextInt();

        boolean b=false;
        boolean h=false;
        if (len >= 10000 || wid >= 10000 || hei >= 10000 ||
            (long)len * wid * hei >= 1000000000L) {
            b = true;
        }
        if(mass>= 100 ) h=true;

        if(b && h) System.out.println("Both");
        else if(b && !h) System.out.println("Bulky");
        else if(h && !b) System.out.println("Heavy");
        else System.out.println("Neither");

        sc.close();
    }
}
