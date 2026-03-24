package Task4;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(isPalindrome(input));
    }
}
