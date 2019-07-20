package ProductCatalog;

import java.util.ArrayList;

public class ProductCatalog {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Book("John Smith",19.99, "12345",1250));
        products.add(new Pants("Navdeep Gill", 59.99, 34,30));
        products.add(new Product("Jackson Stuart", 1.99));
        
        System.out.printf("%-10s\t%10s\t%-10s\n","NAME","PRICE","TYPE");
        for (Product p : products) {
            System.out.printf("%-10s\t%8.2f\t%-10s\n", p.getName(), p.getPrice(), p.getType());
            
        }
        
    }
}
