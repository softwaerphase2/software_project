package spring2023Project;

public class Worker {

	private String Name;
	private String Phone_Number;
	private String Address;
	private String Availability;
	private int Salary;
	/*

	menu :
	print all product is vlaue =1
	select one product
	change ex to zero
	send to product onwer
	 */

	 Worker(String name, String phone_Number, String address, String availability, int salary) {
		this.Name = name;
		this.Phone_Number = phone_Number;
		this.Address = address;
		this.Availability = availability;
		this.Salary = salary;
	}

	 Worker() {

	}

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getPhone_Number() {
		return Phone_Number;
	}
	
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public String isAvailability() {
		return Availability;
	}
	
	public void setAvailability(String availability) {
		Availability = availability;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString()
	{
		return this.Name+" "+this.Phone_Number+" "+this.Address+" "+this.Availability+" "+this.Salary;
	}
}
