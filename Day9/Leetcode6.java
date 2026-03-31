package Day9;

import java.util.Scanner;

public class Leetcode6 {

     public static String convert(String s, int numRows) {
        if(s.length() <= numRows || numRows ==1){
            return s;
        }
        int cur=0;
        boolean f=false;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0; i< numRows;i++){
            sb[i]= new StringBuilder();
        }
        for(char ch: s.toCharArray()){
            sb[cur].append(ch); 
            if(cur==0 || cur== numRows-1){
                f= !f;
            }
            cur+= f? 1  : -1;
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder r : sb){
           // System.out.println(r);
            ans.append(r);
        }
        return ans.toString();
    // return sb.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s= sc.nextLine();
        int numRows= sc.nextInt();
        System.out.println(convert(s,numRows));
        sc.close();
    }
}