package HolidayTask1.com.CartSystem.util;

public class DiscountUtil {

    // Apply discount based on total amount
    public static double applyDiscount(double totalAmount) {

        if (totalAmount >= 5000) {
            System.out.println("20% Discount Applied!");
            return totalAmount * 0.8; 
        } 
        else if (totalAmount >= 2000) {
            System.out.println("10% Discount Applied!");
            return totalAmount * 0.9;
        } 
        else if (totalAmount >= 1000) {
            System.out.println("5% Discount Applied!");
            return totalAmount * 0.95; 
        }

        System.out.println("No discount applied.");
        return totalAmount;
    }
}    

