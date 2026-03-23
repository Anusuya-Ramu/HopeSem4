package Task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode217 {
    /*217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3. */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<>();
        boolean res=false;
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]))
            {
                s.add(nums[i]);
            }
            else
            {
                res=true;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        boolean result = containsDuplicate(num);
        System.out.println(result);
        sc.close();
    }
}
