package Day5;

import java.util.ArrayList;
import java.util.List;

public class Leetcode345 {
    /*345. Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm". */

    public static String reverseVowels(String s) {
        List<Character> l=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
             char c = s.charAt(i);
             if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
             {
                l.add(c);
             }
        }
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
             if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
             {
                sb.append(l.get(j));
                j++;
             }
             else
             {
                sb.append(c);
             }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        String result = reverseVowels(s);
        System.out.println("String after reversing vowels: " + result);
    }
}
