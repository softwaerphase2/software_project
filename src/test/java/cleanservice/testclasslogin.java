package cleanservice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testclasslogin {
	


	    @Test
	    public void testValidLogin() {
	        Customer customer = new Customer("jafar","sweity", "jafar@email.com","1234", "password123");
	        assertTrue(customer.login("jafar@email.com", "password123"));
	    }

	    @Test
	    public void testInvalidPassword() {
	        Customer customer = new Customer("jafar","sweity", "jafar@email.com","1234", "password123");
	        assertFalse(customer.login("jafar@email.com", "wrongpassword"));
	    }

	    @Test
	    public void testInvalidEmail() {
	        Customer customer =new Customer("jafar","sweity", "jafar@email.com","1234", "password123");
	        assertFalse(customer.login("wrongemail@email.com", "password123"));
	    }
	
	



}
