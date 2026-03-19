package Day2;
import java.util.*;
public class Leetcode1672 {
    /*row sum with max totals  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }   
        }
        
        System.out.println("the maximum row sum is "+max);
        sc.close();
    }
}
