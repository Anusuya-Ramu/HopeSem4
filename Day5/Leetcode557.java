package Day5;

import java.util.Scanner;

public class Leetcode557 {
    /*557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc" */

    public static String reverse(String s){
        StringBuffer sb=new StringBuffer(s);
        //for(int i=s.length()-1 ;i>=0;i--){
          //  sb.append(s.charAt(i));
        //}
        return sb.reverse().toString();
    }
    public static  String reverseWords(String s) {
        String[] str= s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length;i++){
            sb.append(reverse(str[i]));
            if(i!= str.length-1){
                sb.append(" ");
            }
            
        }
        return sb.toString();
    }


    // not efficient 
   /* public String reverseWords(String s){
        Stack<Character> st=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                st.push(s.charAt(i));
            }
            else{
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(" ");
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a string to reverse each word:");
        String input = sc.nextLine();
        String result = reverseWords(input);
        System.out.println("Reversed words: " + result);
        sc.close();
    }
}

