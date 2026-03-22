package Day3;

import java.util.Scanner;

public class Leetcode7 {
    /* 7. Reverse Integer
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
     */
    public static int reverse(int x) {
        int s=-1;
        if(x>=1){
            s=1;
        }
        int ans=0;
        x=Math.abs(x);
        while(x>0){
            int r=x%10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            ans=ans*10+r;
            x/=10;
        }
        return s==-1 ? ans*-1 : ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x)); 
        sc.close();
    }
}
