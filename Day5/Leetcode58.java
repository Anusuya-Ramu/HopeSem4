package Day5;

import java.util.Scanner;

public class Leetcode58 {
    /* Length of Last Word */
    public static int lengthOfLastWord(String s) {
        String[] part=s.split(" ");
        String str=part[part.length-1];
        int n=str.length();
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + result);
        sc.close();
    }
}
