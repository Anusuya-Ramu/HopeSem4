package Day10;

public class throwexception {
    public static void main(String[] args) {
        int age = 14;

        try {
            if (age <= 18) {
                throw new ArithmeticException("Not eligible");
            }
            System.out.println("Eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}