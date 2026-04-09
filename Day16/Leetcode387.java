package Day16;

public class Leetcode387 {
     public static  int firstUniqChar(String s) {
       /*for(int i=0;i<s.length();i++){
        int c=0;
        char ch= s.charAt(i);
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch){
                c++;
            }
        }
        if(c==1){
            return i;
        }
       } 
       return -1; */ 
       // TLE
       
       int[] f=new int[26];
       for(int i=0;i<s.length() ;i++){
        f[s.charAt(i)-'a']++;
       }
       for(int  i=0;i<s.length();i++){
        if(f[s.charAt(i)-'a']==1){
            return i;
        }
       }
       return -1;
        //--->  6ms 


      /* Map<Character,Integer> m= new HashMap<>();
       char[] ch= s.toCharArray();
       for(char c : ch){
            m.put(c, m.getOrDefault(c, 0) + 1);
       }
       for(int i=0;i<s.length();i++){
         int v= m.get(s.charAt(i));
         if(v==1){
            return i;
         }
       }
       return -1; //--> 31ms */
       

    }
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));
    }
}
