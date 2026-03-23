package Day4;

import java.util.Scanner;

public class Leetcode125 {
    /*125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome. */

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^A-Za-z0-9]","");
        int st=0;
        int end=s.length()-1;
        while(st<end)
        {
            if(s.charAt(st)!=s.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = isPalindrome(s);
        System.out.println(result);
         sc.close();
    }
}
