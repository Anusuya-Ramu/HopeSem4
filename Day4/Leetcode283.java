package Day4;

import java.util.Scanner;

public class Leetcode283 {
    /*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0] */
    public static  void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        while(i<nums.length)
        {
            nums[i]=0;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        moveZeroes(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
