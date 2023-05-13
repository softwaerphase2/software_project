package springProject;

public class Worker {

	private String name;
	private String phoneNumber;
	private String address;
	private String availability;
	private int salary;


	 Worker(String name, String phoneNumber, String address, String availability, int salary) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.availability = availability;
		this.salary = salary;
	}

	 Worker() {

	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String isAvailability() {
		return availability;
	}
	
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return this.name +" "+this.phoneNumber +" "+this.address +" "+this.availability +" "+this.salary;
	}
}
