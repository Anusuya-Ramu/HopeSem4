package Day4;

import java.util.Scanner;

public class Leetcode1295 {
    /*  Find Numbers with Even Number of Digits
    
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.*/

    public static boolean check(int n){
        int nod=(int) Math.log10(n)+1;
        return nod%2==0 ? true : false;
    }
    public static int findNumbers(int[] num) {
        int count=0;
        for(int i=0;i<num.length;i++){
            if(check(num[i])){
                count++;
            }
        }
        return count;
    }
    
   /* public static int findNumbers(int[] num){
        int c=0;
        for(int i:num){
            String s=Integer.toString(i);
            if(s.length()%2==0){
                c++;
            }
        }
        return c;
    }
    */
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n]; 
    for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
    }
    int result = findNumbers(num);
    System.out.println(result);
    sc.close();
   }
}
