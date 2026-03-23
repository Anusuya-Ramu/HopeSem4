package Day4;

import java.util.Arrays;
import java.util.Scanner;
public class Leetcode242 {
    /* valid anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false */
    public static boolean isAnagram(String s, String t) {
        char[] f1=new char[26];
        char[] f2=new char[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            f1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            f2[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean result = isAnagram(s, t);
        System.out.println(result);
        sc.close();
    }
}
