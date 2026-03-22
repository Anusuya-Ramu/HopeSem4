package Day3;

import java.util.Scanner;

public class Leetcode1217 {
    /*We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position. */

    public static int minCostToMoveChips(int[] p) {
        int oc=0,ec=0;
        for(int i:p){
            if(i%2==0){
                ec++;
            }
            else oc++;
        }
        
        return Math.min(ec,oc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
        }
        System.out.println(minCostToMoveChips(p)); 
        sc.close();
    }
}
