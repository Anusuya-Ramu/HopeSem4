package Task11;

public class Leetcode443 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0) {
         columnNumber--;
        int rem= columnNumber%26+65;
        sb.append((char)rem);
         columnNumber/=26;
        }
        return (sb.reverse().toString());
    }
  
  public static void main(String[] args) {
    String ans=convertToTitle(701);
    System.out.print(ans);
  }
}
