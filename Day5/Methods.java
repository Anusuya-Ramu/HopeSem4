package Day5;

import java.util.Scanner;

public class Methods {
    /*public static int square(int num) {
        return num * num;
    }*/
    
    public int square(int num) {
        return num * num;
    }
    public static void main(String[] args) {

        Methods obj= new Methods(); 

        Scanner sc = new Scanner(System.in);
        
        String s="Hello, World!";
        System.out.println(s);


        System.out.println("Enter a number to find its square:");
        int n=sc.nextInt();
        int result = obj.square(n);
        System.out.println("The square of " + n + " is: " + result);
        sc.close();
    }
}
