package Day3;

import java.util.Scanner;

public class Leetcode1822 {
    /*1822. Sign of the Product of an Array
Implement a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product). */
    public static int arraySign(int[] nums) {
        int n=0;
        for(int i:nums){
             if(i<0){
                n++;
            }else{
                if(i==0) return 0;
            }
        }
        return n%2==0 ? 1 : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(arraySign(nums)); 
        sc.close();
    }
}
