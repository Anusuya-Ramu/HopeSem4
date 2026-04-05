package HolidayTask2.com.CartSystem.main;
import java.util.*;
import HolidayTask2.com.CartSystem.model.*;
import HolidayTask2.com.CartSystem.service.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();
        Cart cart = new Cart();

        CartService cartService = new CartService();
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService();

        Order lastOrder = null;

        while (true) {

            System.out.println("\n====== E-COMMERCE MENU ======");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Exit");
            System.out.println("6. Remove from Cart");
            System.out.println("7. Search Product");
            System.out.println("8. Place Order");
            System.out.println("9. View Last Order");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                //  Add Product
                case 1:
                    Product p = new Product();

                    System.out.print("Enter Product ID: ");
                    p.setId(sc.nextInt());

                    sc.nextLine(); // consume newline
                    System.out.print("Enter Product Name: ");
                    p.setName(sc.nextLine());

                    System.out.print("Enter Price: ");
                    p.setPrice(sc.nextDouble());

                    productList.add(p);
                    System.out.println("Product added successfully!");
                    break;

                //  View Products
                case 2:
                    if (productList.isEmpty()) {
                        System.out.println("No products available!");
                    } else {
                        for (Product prod : productList) {
                            System.out.println(
                                prod.getId() + " | " +
                                prod.getName() + " | ₹" +
                                prod.getPrice()
                            );
                        }
                    }
                    break;

                //  Add to Cart
                case 3:
                    System.out.print("Enter Product ID to add: ");
                    int id = sc.nextInt();

                    Product selected = productService.searchById(productList, id);

                    if (selected == null) {
                        System.out.println("Product not found!");
                        break;
                    }

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    cartService.addToCart(cart, selected, qty);
                    System.out.println("Added to cart!");
                    break;

                //  View Cart
                case 4:
                    cartService.displayCart(cart);
                    break;

                //  Exit
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;

                //  Remove from Cart
                case 6:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    cartService.removeFromCart(cart, removeId);
                    break;

                //  Search Product
                case 7:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter product name to search: ");
                    String name = sc.nextLine();
                    productService.searchByName(productList, name);
                    break;

                //  Place Order
                case 8:
                    lastOrder = orderService.placeOrder(cart);
                    break;

                //  View Last Order
                case 9:
                    orderService.displayOrder(lastOrder);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
       
    }
}