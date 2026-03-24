package Day5;

import java.util.Scanner;

public class Leetcode1221 {
    /*
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'. */

    public static  int balancedStringSplit(String s) {
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                c++;
            }else{
                c--;
            }
            if(c==0) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a balanced string:");
        String s = sc.nextLine();
        int result = balancedStringSplit(s);
        System.out.println("Number of balanced substrings: " + result);
        sc.close();
    }
}
