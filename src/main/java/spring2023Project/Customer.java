package spring2023Project;

import java.util.ArrayList;

public class Customer {
    private  String ID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String CustomerType ;
    private String HasOrder;
    private boolean existence;
    public  ArrayList<Product> productList = new ArrayList<Product>();
   /* public Customer(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }*/

    /*public boolean login(String enteredEmail, String enteredPassword) {
        if (enteredEmail.equals(email) && enteredPassword.equals(password)) {
            return true;
        }
        return false;
    }*/

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setCustomerType (String t) {
    	
    	CustomerType = t;
    	
    }

    public String getCustomerType () {
    	
    	return CustomerType;
    	
    }

    public void setHasOrder (String b) {
    	
    	HasOrder = b;
    	
    }

    public String getHasOrder () {
    	
    	return HasOrder;
    	
    }

	public boolean isExistence() {
		return existence;
	}

	public void setExistence(boolean e) {
		existence = e;
	}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}