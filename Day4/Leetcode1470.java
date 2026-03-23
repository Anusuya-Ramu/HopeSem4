package Day4;

import java.util.Scanner;

public class Leetcode1470 {
    /*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. */
    public static int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int k=0;
        int[] t= new int[n*2];
        for(int m=0;m<nums.length;m++){
            if(m%2==0){
            t[k]=nums[i];
            i++;
            k++;
        }else{
            t[k]=nums[j];
            j++;
            k++;
        }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n*2];
        for (int i = 0; i < n*2; i++) {
            num[i] = sc.nextInt();
        }
        int[] result = shuffle(num, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
