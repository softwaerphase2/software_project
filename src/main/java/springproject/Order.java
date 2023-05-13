package springproject;

public class Order {

	private String status;
	private int discount;
	private boolean isReady;
	private String [] items;
	private String address;
	private int totalPrice;
	private Worker workerOnorder;
	
	public void setOrderStatus(String s) {

		this.status = s;
		
	}
	
	public String getOrderStatus() {
		
		return status;
		
	}	
	
	public void setOrderDiscount(int d) {
		
		discount = d;
		
	}
	
	public int getOrderDiscount() {
		
		return discount;
		
	}
	
	public void setIsReady(boolean b) {
		
		isReady = b;
		
	}
	
	public boolean getIsReady() {
		
		return isReady;
		
	}

	public String [] getItems() {
		return items;
	}

	public void setItems(String [] items) {
		this.items = items;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Worker getWorkerOnorder() {
		return workerOnorder;
	}

	public void setWorkerOnorder(Worker workerOnorder) {
		this.workerOnorder = workerOnorder;
	}
	
}
