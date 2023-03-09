package cleanservice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cleanservice.Customer;

public class CleaningServices {

    private List<Customer> customers;
    private List<Product> products;

    public CleaningServices() {
        this.customers = new ArrayList<Customer>();
        this.products = new ArrayList<Product>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        this.customers.remove(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void printInvoice(Customer customer) {
        System.out.println("Invoice for " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Delivery Date: " + customer.getDeliveryDate());
        System.out.println("Items to clean:");
        double totalPrice = 0;
        for (Product product : customer.getProducts()) {
            System.out.println("- " + product.getName() + " - " + product.getDescription() + " - " + product.getPrice());
            totalPrice += product.getPrice();
        }
        System.out.println("Total Price: " + totalPrice);
    }
}