package cleanservice;
import java.awt.desktop.SystemEventListener;
import java.util.*; 

import java.util.jar.*;
import cleanservice.Customer;

public class home {
	private static List<Customer> customers = new ArrayList<Customer>();
	private static List<Order> orders = new ArrayList<Order>();
	private static List<Worker> workers = new ArrayList<Worker>();
	private String adminUsername = "admin";
	private String password = "admin";
	private boolean type = true;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1.create new order:");
		System.out.println("2.create new worker:");
		
		int answer = in.nextInt();
		switch(answer) {
		case 1:
			System.out.println("add customer:\nfirst name\tlast name\temail\tphone\taddress\n");
			String info = in.nextLine();
			addCustomer(info);
			break;
		}
		
		
		//upload your great learning certificate upon course completion

		
}
	public static void printMenu(boolean type) {
		
		
	}
	private static void printAdminMenu() {
		System.out.println("add : ");
		
		
		
 
		
		
   
	}
		public static void addWorker(String workerinfo) {
			String[] data = workerinfo.split(" ");
			workers.add(new Worker(data[0], data[1], data[2], data[3], data[4], data[5]));
	}
	public static void addCustomer(String customerInfo) {
		String[] data = customerInfo.split(" ");
		
		customers.add(new Customer(data[0], data[1], data[2], data[3], data[4]));
	}
	public static void addOrder(Order order) {
		orders.add(order);
	}

}
