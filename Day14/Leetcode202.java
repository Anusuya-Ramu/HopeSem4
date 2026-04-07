package Day14;

import java.util.*;

public class Leetcode202 {
    public static int happy(int n){
    int sum=0;
    while(n>0){
        int r=n%10;
        sum+=(r*r);
        n/=10;
    }
    return sum;
   }
    public static boolean isHappy(int n){
       Set<Integer> seen = new HashSet<>();
        int res = n;

        while (res != 1) {
            if(seen.contains(res)) return false;
            seen.add(res);
            res = happy(res);  
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
