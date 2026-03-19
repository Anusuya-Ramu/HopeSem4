package Task2;
import java.util.List;
import java.util.Scanner;
public class Leetcode2824 {
    /*Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
  */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array and target:");
        int n = sc.nextInt();
        int target = sc.nextInt();
        List<Integer> num = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
           num.add(sc.nextInt());
        }
        int c=0;
        for(int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                int sum=num.get(i)+num.get(j);
                if(sum < target){
                    c++;
                }
            }
        }
        System.out.println("The number of pairs is: " + c);
         sc.close();
    
    }
}
