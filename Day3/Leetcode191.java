package Day3;
import java.util.*;
public class Leetcode191 {
    /*Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).*/

    public  static  int hammingWeight(int n) {
      /* int res=0;
       while(n>0)
       {
           int rem=n%2;
           res=res+rem;
           n=n/2;
       }
       return res;*/


      /*int c=0;
       while(n>0){
        if(n%2==1) c++;
        n/=2;
       }
       return c;*/


       return Integer.bitCount(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hammingWeight(n)); 
        sc.close();
    }   
}
