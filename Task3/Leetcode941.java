package Task3;
import java.util.Scanner;
public class Leetcode941 {
    /* Valid Mountain Array */
    public static boolean validMountainArray(int[] num) {
       /* if(nums.length<3) return false;
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]> nums[i] || nums[i+1]> nums[i]){
                c++;
            }
            if(c>1){
                return false;
            }
        }
        int n=nums.length;
      //  if(nums[n-1])
        if(nums[n-1]== nums[n-2] ){
            return false;
        }
        return true;
        */
        int n = num.length;
        if (n < 3) return false;
        int i = 0;
        while (i + 1 < n && num[i] < num[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) return false;
        while (i + 1 < n && num[i] > num[i + 1]) {
            i++;
        }
        return i == n - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        boolean result = validMountainArray(num);
        System.out.println(result);
        sc.close();
    }
}
