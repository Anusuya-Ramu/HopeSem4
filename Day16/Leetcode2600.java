package Day16;
public class Leetcode2600 {
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if( k <= (numOnes+numZeros)) return numOnes;
        else return (numOnes -(k- (numOnes +  numZeros)));
    }
    public static void main(String[] args) {
        int numOnes=3,numZeros=2,numNegOnes=0,k=2;
        System.out.println(kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k));
    }
}