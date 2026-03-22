package Day3;

import java.util.Scanner;

public class Leetcode231 {
    /* 231. Power of Two
     * Given an integer n, return true if it is a power of two. Otherwise, return false.
     * An integer n is a power of two, if there exists an integer x such that n == 2^x.
     */
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n & (n-1))==0?true: false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
        sc.close();

    }
}
