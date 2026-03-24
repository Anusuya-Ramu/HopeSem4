package Task4;

public class MethodsInStringBufferAndStringbuilder {

    public static void main(String[] args) {

        // StringBuffer (thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");

        sbf.append(" World");                 
        System.out.println("Append: " + sbf);

        sbf.insert(5, " Java");              
        System.out.println("Insert: " + sbf);

        sbf.replace(0, 5, "Hi");            
        System.out.println("Replace: " + sbf);

        sbf.delete(2, 7);                   
        System.out.println("Delete: " + sbf);

        sbf.reverse();                       
        System.out.println("Reverse: " + sbf);

        System.out.println("Capacity: " + sbf.capacity()); 
        System.out.println("Length: " + sbf.length());     


        // StringBuilder (faster, not thread-safe)
        StringBuilder sbd = new StringBuilder("Code");

        sbd.append(" Fast");
        System.out.println("\nAppend: " + sbd);

        sbd.insert(4, " Java");
        System.out.println("Insert: " + sbd);

        sbd.replace(0, 4, "Write");
        System.out.println("Replace: " + sbd);

        sbd.delete(5, 9);
        System.out.println("Delete: " + sbd);

        sbd.reverse();
        System.out.println("Reverse: " + sbd);

        System.out.println("Capacity: " + sbd.capacity());
        System.out.println("Length: " + sbd.length());
    }
}
