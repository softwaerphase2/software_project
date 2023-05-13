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
	
	public void setAppUserType(String userT) {
		
		this.userType = userT;
		
	}
	
	public String getAppUserType() {
		
		return userType;
		
	}

	public Product getAddedProduct() {
		return addedProduct;
	}

	public void setAddedProduct(Product addedProduct) {
		this.addedProduct = addedProduct;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int t) {
		this.total = t;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int c) {
		this.cost = c;
	}

	public int getPayrolls() {
		return payrolls;
	}

	public void setPayrolls(int p) {
		this.payrolls = p;
	}

	public boolean isReprtGenerated() {
		return reprtGenerated;
	}

	public void setReprtGenerated(boolean r) {
		this.reprtGenerated = r;
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
		this.invoiceGenerated = invoiceGenerated;
	}
	
	
	

}


