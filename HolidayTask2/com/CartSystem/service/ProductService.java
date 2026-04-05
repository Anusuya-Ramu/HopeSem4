package HolidayTask2.com.CartSystem.service;
import HolidayTask2.com.CartSystem.model.Product;
import java.util.*;

public class ProductService {

    public Product searchById(List<Product> products, int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void searchByName(List<Product> products, String name) {
        boolean found = false;

        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No product found!");
        }
    }
}
