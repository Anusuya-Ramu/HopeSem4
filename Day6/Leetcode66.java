package Day6;

import java.util.Scanner;

public class Leetcode66 {
    /*Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4]. */

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   
                return digits;
            }
            digits[i] = 0;  
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]  a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] ans= plusOne(a);
        for(int i: ans){
            System.out.println(i+" ");
        }
        sc.close();
    }
}
