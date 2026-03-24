package Day5;

import java.util.Scanner;

public class Leetcode28 {
    /*Find the Index of the First Occurrence in a String */
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the haystack string:");
        String haystack = sc.nextLine();
        System.out.println("Enter the needle string:");
        String needle = sc.nextLine();
        int index = strStr(haystack, needle);
        System.out.println("Index of the first occurrence: " + index);
        sc.close();


    }
}
