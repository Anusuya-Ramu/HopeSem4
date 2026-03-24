package Day5;

public class StringBuilderConcept {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb); 
        

        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(sbf);
        sbf.append(" World");
        System.out.println(sbf);
    }
}
