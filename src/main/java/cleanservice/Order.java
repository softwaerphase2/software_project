package cleanservice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cleanservice.Customer;

public class Order {

	private Customer customer;
	private Product product;
	private Worker worker;
	private int price;
	private boolean status;
	public int num_of_order;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

  /*  public void printInvoice(Customer customer) {
        System.out.println("Invoice for " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Email: " + customer.getCustomer_id());
        System.out.println("Delivery Date: " + customer.getDeliveryDate());
        System.out.println("Items to clean:");
        double totalPrice = 0;
        for (Product product : customer.getProducts()) {
            System.out.println("- " + product.getName() + " - " + product.getDescription() + " - " + product.getPrice());
            totalPrice += product.getPrice();
        }
        System.out.println("Total Price: " + totalPrice);
    }*/
}