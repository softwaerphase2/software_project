package spring2023Project;

import java.util.ArrayList;

public class Customer {
    private  String iD;
    private String firstName;
    private String lastName;

    private String email;
    private String password;
    private String customerType ;
    private String hasOrder;


    private boolean existence;
    public  ArrayList<Product> productList = new ArrayList<Product>();

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
    	
    	customerType = t;
    	
    }

    public String getCustomerType () {
    	
    	return customerType;
    	
    }

    public void setHasOrder (String b) {
    	
    	hasOrder = b;
    	
    }

    public String getHasOrder () {
    	
    	return hasOrder;
    	
    }

	public boolean isExistence() {
		return existence;
	}

	public void setExistence(boolean e) {
		existence = e;
	}

    public String getID() {
        return iD;
    }

    public void setID(String ID) {
        this.iD = ID;
    }
}