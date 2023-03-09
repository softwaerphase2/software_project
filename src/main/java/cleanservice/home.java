package cleanservice;
import java.util.*; 

import java.util.jar.*;
import cleanservice.Customer;

public class home {
	private static List<Customer> customers;
	
	public static void main(String[] args) {
		
		

}
	public  boolean login(String email, String password) {
	    for (Customer customer : customers) {
	        if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
	            return true;
	        }
	    }
	    return false;
	}
}
