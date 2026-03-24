package Day5;
public class StringConcept {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1+=" World!";
        System.out.println(s1);

        System.out.println("String functions:");
        System.out.println("Length: " + s1.length());
        System.out.println("Character at index 0: " + s1.charAt(0));
        System.out.println("Substring from index 6: " + s1.substring(6));
        System.out.println("Index of 'W': " + s1.indexOf('W'));
        System.out.println("Replace 'o' with '0': " + s1.replace('o', '0'));

        String str=" he is a good boy ";
        System.out.println("Trimmed string: '" + str.trim() + "'");
        String[] sample= str.split(" ");
        for(String t: sample){
            System.out.println(t+" ");
        }
    }
}