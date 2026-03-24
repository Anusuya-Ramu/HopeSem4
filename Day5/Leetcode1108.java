package Day5;

import java.util.Scanner;

public class Leetcode1108 {
    /*
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]". */

    public static  String fun(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a valid IPv4 address:");
        String ipAddress = sc.nextLine();
        String defangedAddress = fun(ipAddress);
        System.out.println("Defanged IP address: " + defangedAddress);
        sc.close();
    }
}
