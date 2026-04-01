package Task10.com.web.main;

import com.ecommerce.model.Product;
import com.ecommerce.service.CartService;
import com.ecommerce.util.DiscountUtil;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService cart = new CartService();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Product Price: ");
            int price = sc.nextInt();

            int discountedPrice = DiscountUtil.applyDiscount(price);

            Product p = new Product(id, name, discountedPrice);
            cart.addProduct(p);
        }

        System.out.println("\n----- CART DETAILS -----");
        cart.displayCart();

        int totalAmount = cart.calculateTotal();
        System.out.println("\nTotal Amount after discount: $" + totalAmount);

        sc.close();
    }
}
