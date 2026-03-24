package Day5;

import java.util.Scanner;

public class Leetcode344 {
    /*Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory. */

    public static  void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");       
        String input = sc.nextLine();
        char[] s = input.toCharArray(); 
        reverseString(s);
        System.out.println("Reversed string: " + new String(s));    
        sc.close();
    }
}
