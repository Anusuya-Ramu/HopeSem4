package Day2;
import java.util.*;
public class Leetcode268 {
    /* missing number */
    public int fun(int[] num) {
        int xor = 0;
        int i = 0;
        for (i = 0; i < num.length; i++) {
            xor = xor ^ i ^ num[i];
        }
        return xor ^ i; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int total=n*(n+1)/2;
       System.out.println("Sum method: " + (total - sum));
       System.out.println("XOR method: " + new Leetcode268().fun(arr));
        sc.close();
    }
}
