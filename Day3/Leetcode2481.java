package Day3;

import java.util.Scanner;

public class Leetcode2481 {
    /*A valid cut in a circle can be:

A cut that is represented by a straight line that touches two points on the edge of the circle and passes through its center, or
A cut that is represented by a straight line that touches one point on the edge of the circle and its center.   */
    public static int numberOfCuts(int n) {
        if( n==1) return 0;
        if(n%2==0){
            return n/2;
        }
        return (n*2)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfCuts(n)); 
        sc.close(); 
    }
}
