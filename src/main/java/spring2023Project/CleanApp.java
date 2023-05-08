package spring2023Project;

public class CleanApp {

	private String UserType;
	private Product AddedProduct;
	private Customer AddedCustomer;
	private int total;
	private int cost;
	private int payrolls;
	private boolean reprtGenerated;
	private boolean InvoiceGenerated;
	
	public void setAppUserType(String S) {
		
		UserType = S;
		
	}
	
	public String getAppUserType() {
		
		return UserType;
		
	}

	public Product getAddedProduct() {
		return AddedProduct;
	}

	public void setAddedProduct(Product addedProduct) {
		AddedProduct = addedProduct;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int t) {
		total = t;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int c) {
		cost = c;
	}

	public int getPayrolls() {
		return payrolls;
	}

	public void setPayrolls(int p) {
		payrolls = p;
	}

	public boolean isReprtGenerated() {
		return reprtGenerated;
	}

	public void setReprtGenerated(boolean r) {
		reprtGenerated = r;
	}

	public Customer getAddedCustomer() {
		return AddedCustomer;
	}

	public void setAddedCustomer(Customer addedCustomer) {
		AddedCustomer = addedCustomer;
	}

	public boolean isInvoiceGenerated() {
		return InvoiceGenerated;
	}

	public void setInvoiceGenerated(boolean invoiceGenerated) {
		InvoiceGenerated = invoiceGenerated;
	}
	
	
	
	/*public boolean is_LoggedIn = false;
	public boolean is_InTheStore = false;
	public boolean addProduct = false;
	public boolean is_Contained = false;
	public boolean errorMessage = false;
	
	public boolean reportReady = false;
	public boolean is_asked = false;
	public boolean generateReport = false;
	public boolean is_valid = false;
	
	
	
	
	
	public boolean Cif_is_LoggedIn() {
		
		
		return false;
	}
	


public boolean Cif_is_Contained() {
	
	
	return false;
}

public boolean Cif_is_valid() {
	
	
	return false;
}


public void ErrorMessage() {         }







public boolean Cif_reportReady() {
	
	
	return false;
}

public boolean Cif_is_asked() {
	
	
	return false;
}

public void GenerateReport() {        }*/

}


