package Task5;

import java.util.HashMap;
import java.util.Scanner;

public class Leetcode41 {
    /*41. First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array. */

     public static int firstMissingPositive(int[] nums) {
        /*List<Integer>l=new ArrayList<>();
        int max=0;
        for(int n:nums){
            l.add(n);
            max=Math.max(max,n);
        }
        int i=1;
        int ans=0;
        while( i>0){
            if(!l.contains(i)) {ans=i; break;}
            i++;
        }
        return ans;*/
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],i);
            }
        }
        for(int i=1;i<=100001;i++){
            if(!h.containsKey(i)){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]  a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int ans= firstMissingPositive(a);
        System.out.println(ans);
        sc.close();
    }
}
