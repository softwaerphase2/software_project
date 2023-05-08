package spring2023Project;

public class Order {

	private String Status;
	private int Discount;
	private boolean IsReady;
	private String [] Items;
	private String Address;
	private int Total_Price;
	private Worker Worker_On_Order;
	
	public void setOrderStatus(String s) {
		
		Status = s;
		
	}
	
	public String getOrderStatus() {
		
		return Status;
		
	}	
	
	public void setOrderDiscount(int d) {
		
		Discount = d;
		
	}
	
	public int getOrderDiscount() {
		
		return Discount;
		
	}
	
	public void setIsReady(boolean b) {
		
		IsReady = b;
		
	}
	
	public boolean getIsReady() {
		
		return IsReady;
		
	}

	public String [] getItems() {
		return Items;
	}

	public void setItems(String [] items) {
		Items = items;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getTotal_Price() {
		return Total_Price;
	}

	public void setTotal_Price(int total_Price) {
		Total_Price = total_Price;
	}

	public Worker getWorker_On_Order() {
		return Worker_On_Order;
	}

	public void setWorker_On_Order(Worker worker_On_Order) {
		Worker_On_Order = worker_On_Order;
	}
	
}
