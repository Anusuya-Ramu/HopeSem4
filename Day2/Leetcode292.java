package Day2;
import java.util.*;
public class Leetcode292 {
    /*nim game */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stones");
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println("lose");
        }
        else{
            System.out.println("win");
        }
        sc.close();
    }
}
