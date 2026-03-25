package Day6;

import java.util.Scanner;

public class Leetcode34 {
    /*34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4] */

    public static int firstoccur (int[] arr,int n,int tar){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                first=mid;
                high=mid-1;
            }else if(arr[mid]> tar){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }

    public static int lastoccur (int[] arr,int n,int tar){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                last=mid;
                low=mid+1;
            }else if(arr[mid]> tar){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }

    public static int[] searchRange(int[] nums, int target) {
        int len =nums.length;
        int[] ans=new int[2];
        int fst=firstoccur (nums,len,target);
        if(fst==-1){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int lst= lastoccur (nums,len,target);
        ans[0]=fst;
        ans[1]=lst;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int target =sc.nextInt();
        int[]  a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] ans= searchRange(a,target);
        System.out.println(ans[0]+" "+ ans[1]);
        sc.close();
    }
}
