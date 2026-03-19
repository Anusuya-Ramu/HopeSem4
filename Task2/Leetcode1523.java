package Task2;
import java.util.Scanner;
public class Leetcode1523 {
/*Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
Example 1:
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9]. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        //int c=0;
        /*if(low%2==0){
            low++;
        }
        for(int i=low;i<=high;i+=2){
            c++;
        }
        System.out.println(c);*/

        System.out.println("Optimal solution");
        int odd=(high+1)/2-(low/2);
        System.out.println("Count of odd numbers " +odd);
        int even=(high/2)-(low-1)/2;
        System.out.println("Count of even numbers " + even);
        sc.close();
    }
}
