package Task11;

public class Leetcode168 {
    public static int compress(char[] chars) {
        StringBuffer sb= new StringBuffer();
        int j=0;
        while(j< chars.length){
            char ch= chars[j];
            int c=0;
            int i=j;
            while(i < chars.length && chars[i] == ch){
                c++;
                i++;
            }
            if(c==1){
                sb.append(ch);
            }else{
                sb.append(ch);
                sb.append(c);
            }
            j=i;
        }
        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }

        return sb.length();
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int ans=compress(chars);
        System.out.println(ans);
    }
}
