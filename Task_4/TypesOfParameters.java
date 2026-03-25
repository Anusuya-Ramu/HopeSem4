package Task_4;

import java.util.Scanner;

public class TypesOfParameters {

    public static void fun1(int x){
        System.out.println("Value of x: "+x);
    }
    public static int fun2(int x, int y){
        return x+y;
    }
    public static int fun3(){
        return 10;
    }
    public static void fun4(){
        System.out.println("No parameter, no return");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pass parameter return nothing
        System.out.println("Pass parameter return nothing:");
        fun1(5);
        // pass parameter return value
        System.out.println("Pass parameter return value:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int result=fun2(a,b);   
        System.out.println("Result: "+result);


        // no parameter return value
        System.out.println("No parameter return value:");
        int result2=fun3();
        System.out.println("Result: "+result2);

        // no parameter return nothing
        System.out.println("No parameter return nothing:");
        fun4();
        sc.close();
    }
}