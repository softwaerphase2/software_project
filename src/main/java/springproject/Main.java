package springproject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
@SpringBootApplication

public class Main {
	@Autowired
	private EmailSenderService senderService;
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	static String email = "";
	 static ArrayList<Customer> customerList = new ArrayList<Customer>();
	 static ArrayList<Product> productLiist = new ArrayList<Product>();
	 static ArrayList<Worker> WorkerList = new ArrayList<Worker>();
	public static int counter=0;
	public static void main(String[] args) throws InterruptedException {

		Worker worker1=new Worker("ahmad","0592458756","Hebron","yes",200);
		Worker worker2=new Worker("mohammad","0592316246","Amman","yes",150);
		Worker worker3=new Worker("khaled","0593248715","Jenen","no",400);
		Worker worker4=new Worker("zaid","0594557350","Nablus","no",420);
		Worker worker5=new Worker("noor","0593133421","dura","yes",520);
		WorkerList.add(worker1);
		WorkerList.add(worker2);
		WorkerList.add(worker3);
		WorkerList.add(worker4);
		WorkerList.add(worker5);
		Scanner scanner = new Scanner(System.in);
		Admin myadmin=new Admin();
		boolean loggedIn = false;

		System.out.println("Admin dashboard");

		while (!loggedIn) {
			System.out.print("Enter username: ");
			String username = scanner.nextLine();

			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			System.out.println("Please wait a moment until we confirm the information ...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				throw e;
			}
			if (username.equals(myadmin.getAdminName()) && password.equals(myadmin.getAdminPword())) {
				System.out.println("Login successful!");
				loggedIn = true;
				menu();
			} else {

				System.out.println("\n\nInvalid credentials. Please try again.");
			}
		}

		scanner.close();

	}
	

	public static void menu() {

		String[] argss = {};
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != 6) {
			System.out.println("------------------\"<My Main>\"-----------------------");
			System.out.println("Customer product  Data -->[1]");
			System.out.println("Ditribute Order -->[2]");
			System.out.println("Sent Email For Complete Product--> [3]");
			System.out.println("Financial Statistics -->[4]");
			System.out.println("Print Invoice -->[5]");
			System.out.println("Log out  -->[6]");
			System.out.println("-------------------------------------------------");
			System.out.println("Enter Your Choice Number :");
			choice=scanner.nextInt();
			System.out.println("\n\n");
			switch (choice){
				case 1 :
					CRUDMenu();
					break;
				case 2 :
					ditributeOrder();
					break;

				case 3 :
					System.out.println("Enter customer Email");
					Scanner s = new Scanner(System.in);
					email = s.nextLine();

					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {

						Thread.currentThread().interrupt();
						e.printStackTrace();
					}
					SpringApplication.run(Main.class, argss);
					break;

				case 4 :
					break;

				case 5 :
					break;
				default: System.out.println("Invalid choice. Try again.");
			}


		}
	}




	private static void customerNothavewoeker()
	{
		String noo="no";
		for(Customer i:customerList) {
			for (Product j:i.productList)
			{
				if(j.getThereWorker().equals(noo))
				{
					System.out.println("--------------------");
					System.out.println("|"+i+" " +j+"|");
					System.out.println("--------------------");
				}
			}

		}

	}
	private static void ditributeOrder() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("This is all avilable Worker\n ");
		for(Worker i:WorkerList) {

			if(i.isAvailability().equals("yes"))
			{
				System.out.println(i);
			}
		}
		System.out.println("This all Customer have product need worker  \n ");
		customerNothavewoeker();
		System.out.println("slecet the worker for the Customer you need by name of the Customer & the Product \n");
		System.out.println("Customer name : \n");
		String customerName=scanner.nextLine();
		System.out.println("Product  name : \n");
		String productName=scanner.nextLine();




		System.out.print("Select Worker by Write the name : ");

		String find=scanner.nextLine();
		assignWorkerToProduct(customerName, productName, find);



		for(Worker i :WorkerList)
		{
			if(i.getName().equals(find))
			{
				i.setAvailability("no");
			}
		}




	}
	private static void assignWorkerToProduct(String customerName, String productName, String workerName) {
		for(Customer i:customerList)
		{

			if(i.getFirstName().equals(customerName))
			{

				for (Product j:i.productList)
				{

					if(j.getProductName().equals(productName))
					{
						j.setThereWorker("yes");
						j.setWorkerName(workerName);
					}
				}
			}
		}

	}
	public static void CRUDMenu() {
		while (true) {
			logger.info("Welcome to the CRUD menu!");
			logger.info("1. Create Customer");
			logger.info("2. Delete Customer");
			logger.info("3. Update Customer");
			logger.info("4. List Customers by Name");
			logger.info("5. Create Product");
			logger.info("6. Delete Product");
			logger.info("7. Update Product");
			logger.info("8. Show List Products by Name");
			logger.info("0. Exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();


			switch (choice) {
				case 1:
					createCustomer();
					break;
				case 2:
					deleteCustomer();
					break;
				case 3:
					updateCustomer();
					break;
				case 4:
					printAllc();
					break;
				case 5:
					createProduct();
					break;
				case 6:
					deleteProduct();
					break;
				case 7:
					updateProduct();
					break;
				case 8:
					printAllp();
					break;

				case 0:
					System.out.println("Goodbye!");
					return;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
		}

	private static void updateCustomer() {

	}

	private static void updateProduct() {
	}

	private static void deleteCustomer() {

		printAllc();
		System.out.print("Enter Customer ID : ");
		Scanner scanner = new Scanner(System.in);
		String find=scanner.nextLine();

		for(Customer i:customerList) {
			if(find.equals(i.getID()))
			{
				customerList.remove(i);
			}
		}


	}

	private static void deleteProduct() {
		printAllp();
		System.out.print("Enter product number : ");
		Scanner scanner = new Scanner(System.in);
		int find=scanner.nextInt();
		for(Product i: productLiist)
		{
			if(find==i.getNumber())
			{
				productLiist.remove(i);
				i.productOwner.productList.remove(i);
			}

		}

	}

	public static void createCustomer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*** Create Customer ***");
		System.out.print("Enter customer ID : ");
		String id = scanner.nextLine();
		System.out.print("Enter customer first name: ");
		String fname = scanner.nextLine();
		System.out.print("Enter customer last name: ");
		String lname = scanner.nextLine();
		System.out.print("Enter customer email: ");
		String email = scanner.nextLine();
		Customer customer = new Customer();
		System.out.print("Enter customer type: ");
		String type = scanner.nextLine();
		customer.setCustomerType(type);
		System.out.print("Enter true if customer have order or false if not: ");

		String hasorder = scanner.nextLine();
        customer.setFirstName(fname);
		customer.setLastName(lname);
		customer.setEmail(email);
		customer.setHasOrder(hasorder);
		customer.setID(id);
			customerList.add(customer);
		System.out.println("Customer created: " +customer.getID() +" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail()+" "+customer.getHasOrder());
	}
	public static void printAllc()
	{
		for(Customer i:customerList) {
			System.out.println(i.getID()+" "+i.getFirstName()+" "+i.getLastName());
		}

	}
	public static void printAllp()
	{
		for(Customer i:customerList) {
			for(Product j:i.productList)
			{
				System.out.println(j);


			}
		}

	}
	public static void createProduct()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*** Create product ***");
		System.out.print("Enter product name : ");
		String pname = scanner.nextLine();
		System.out.print("Enter product size : ");
		String size = scanner.nextLine();
		System.out.print("Enter product material : ");
		String material = scanner.nextLine();
		printAllc();
		System.out.print("select customer number  : ");
		int customern = scanner.nextInt();
		for(Customer i:customerList)
		{
			if(customern ==Integer.parseInt(i.getID()))
			{
				counter++;
				Product temp=new Product(i,pname,size,material,true,counter);
				temp.setThereWorker("no");
				i.productList.add(temp);
				if(i.getHasOrder().equals("no"))
				{
					i.setHasOrder("yes");
				}
				productLiist.add(temp);


			}
		}

	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {


		senderService.sendEmail(email, "Order is complete", "Hello sir, this message is from Najah Clean Service. Your order is complete.");
	}

}


