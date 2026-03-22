/*You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
*/
package Day3;
import java.util.*;
public class Leetcode1688 {
    public  static int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                count += n / 2;
                n /= 2;
            } else {
                count += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return count; //return n-1; because in every match one team is eliminated, so total matches will be n-1 to get the winner.  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfMatches(n)); 
        sc.close();
    }
}