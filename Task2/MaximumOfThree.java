package Task2;
import java.util.Scanner;
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if (a > b && a > c) {
            max = a; 
        }
        if (b > max) {
            max = b; 
        }
        if (c > max) {
            max = c; 
        }
        System.out.println("The maximum of the three numbers is: " + max);
        // using  build in function
        //int max= Math.max(a, Math.max(b, c));
        sc.close();
    }
}
