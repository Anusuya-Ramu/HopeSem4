package Day2;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operator");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println("ADD TWO NUMBERS");
                System.out.println("The sum is " + (a + b));
                break;
            case '-':
                System.out.println("SUBTRACT TWO NUMBERS");
                System.out.println("The difference is " + (a - b));
                break;
            case '*':
                System.out.println("MULTIPLY TWO NUMBERS");
                System.out.println("The product is " + (a * b));
                break;
            case '/':
                System.out.println("DIVIDE TWO NUMBERS");
                if (b != 0) {
                    System.out.println("The quotient is " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                System.out.println("MODULUS TWO NUMBERS");
                if (b != 0) {
                    System.out.println("The modulus is " + (a % b));
                } else {
                    System.out.println("Cannot perform modulus by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
       System.out.println("perimeter of rectangle is "+(2*(a+b))); 
       sc.close();
    }
}
