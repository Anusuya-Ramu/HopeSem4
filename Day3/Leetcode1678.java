package Day3;

import java.util.Scanner;

public class Leetcode1678 {
    /*You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command. */
    

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String command = sc.nextLine();
        System.out.println(interpret(command));
        sc.close();
    }

}
