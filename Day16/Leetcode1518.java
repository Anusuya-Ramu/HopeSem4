package Day16;

public class Leetcode1518 {
    public static  int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int eb = 0; // empty bottles
        
        while (numBottles > 0) {
            drinked += numBottles;   // drink all current bottles
            eb += numBottles;        // get empty bottles
            
            numBottles = eb / numExchange; // exchange empties for new bottles
            eb = eb % numExchange;         // leftover empties
        }
        return drinked;
    }
    public static void main(String[] args) {
        int numBottles=9,numExchange=3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }
}
