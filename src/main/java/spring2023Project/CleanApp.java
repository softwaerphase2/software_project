package spring2023Project;

public class CleanApp {

	private String userType;
	private Product addedProduct;
	private Customer addedCustomer;
	private int total;
	private int cost;
	private int payrolls;


	private boolean reprtGenerated;
	private boolean invoiceGenerated;
	
	public void setAppUserType(String S) {
		
		userType = S;
		
	}
	
	public String getAppUserType() {
		
		return userType;
		
	}

	public Product getAddedProduct() {
		return addedProduct;
	}

	public void setAddedProduct(Product addedProduct) {
		addedProduct = addedProduct;
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
		return addedCustomer;
	}

	public void setAddedCustomer(Customer addedCustomer) {
		this.addedCustomer = addedCustomer;
	}

	public boolean isInvoiceGenerated() {
		return invoiceGenerated;
	}

	public void setInvoiceGenerated(boolean invoiceGenerated) {
		invoiceGenerated = invoiceGenerated;
	}
	
	
	

}


