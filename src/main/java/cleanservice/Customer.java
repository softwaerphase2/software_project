package cleanservice;

import java.util.List;

import io.cucumber.java.it.Date;

public class Customer {
    private String firstName;
    private String lastName;
    private String Customer_id;
    private String phone;
    private String address;
 
    

    public Customer(String firstName, String lastName, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Customer_id = email;
        this.phone = phone;
        this.address = address;
        
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomer_id() {
        return this.Customer_id;
    }

    public void setCustomer_id(String email) {
        this.Customer_id = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	public boolean login(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

	
    
}