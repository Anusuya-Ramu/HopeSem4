package HolidayTask2.com.CartSystem.service;
import HolidayTask2.com.CartSystem.model.*;
import HolidayTask2.com.CartSystem.util.DiscountUtil;

public class CartService {

    public void addToCart(Cart cart, Product product, int quantity) {
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(quantity);
        cart.addItem(item);
    }

    public void displayCart(Cart cart) {

    if (cart.getItems().isEmpty()) {
        System.out.println("Cart is empty!");
        return;
    }

    double total = 0;

    for (CartItem item : cart.getItems()) {
        double itemTotal = item.getTotalPrice();
        total += itemTotal;

        System.out.println(
            item.getProduct().getName() +
            " | Qty: " + item.getQuantity() +
            " | Price: " + itemTotal
        );
    }

    System.out.println("Subtotal: " + total);

    double finalAmount = DiscountUtil.applyDiscount(total);

    System.out.println("Final Amount: " + finalAmount);
    }

    public void removeFromCart(Cart cart, int productId) {
    CartItem toRemove = null;

    for (CartItem item : cart.getItems()) {
        if (item.getProduct().getId() == productId) {
            toRemove = item;
            break;
        }
    }

    if (toRemove != null) {
        cart.getItems().remove(toRemove);
        System.out.println("Item removed from cart!");
    } else {
        System.out.println("Item not found in cart!");
    }
   }
}
