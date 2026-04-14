package HolidayTask1.com.CartSystem.service;
import HolidayTask1.com.CartSystem.model.*;
import java.util.*;
import HolidayTask1.com.CartSystem.util.DiscountUtil;

public class OrderService {
    
        private static int orderCounter = 1;

        public Order placeOrder(Cart cart) {

        if (cart.getItems().isEmpty()) {
            System.out.println("Cart is empty! Cannot place order.");
            return null;
        }

         Order order = new Order();
        order.setOrderId(orderCounter++);

        order.setItems(new ArrayList<>(cart.getItems()));

        double total = cart.getTotalPrice();
        double finalAmount = DiscountUtil.applyDiscount(total);

        order.setTotalAmount(finalAmount);

        cart.getItems().clear();

        System.out.println("Order placed successfully! Order ID: " + order.getOrderId());
        System.out.println("Final Paid Amount: " + finalAmount);

        return order;
        }
    
        public void displayOrder(Order order) {
            if (order == null) return;
    
            System.out.println("\nOrder ID: " + order.getOrderId());
    
            for (CartItem item : order.getItems()) {
                System.out.println(
                    item.getProduct().getName() +
                    " | Qty: " + item.getQuantity() +
                    " | Price: " + item.getTotalPrice()
                );
            }
    
            System.out.println("Total Amount: " + order.getTotalAmount());
        }
    }

