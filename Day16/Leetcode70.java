package Day16;

public class Leetcode70 {
    public static  int climbStairs(int n) {
        if(n<=2) return n;
       int a=1,b=2;
        int c=0;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbStairs(n));
    }
}
