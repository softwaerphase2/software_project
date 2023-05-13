package springproject;

public class Product {
    Customer productOwner;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private int number;
	private String name;
	private String size;
	private String material;
	private boolean existence;
	private String thereWorker;

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	private String workerName;

	public String getThereWorker() {
		return thereWorker;
	}

	public void setThereWorker(String thereWorker) {
		this.thereWorker = thereWorker;
	}



	public Product(Customer productOwner, String name, String size, String material, boolean existence,int number) {
		this.productOwner = productOwner;
		this.name = name;
		this.size = size;
		this.material = material;
		this.existence = existence;
		this.number=number;
	}

	Product(Customer owner)
	{
		this.productOwner=owner;
	}
	Product (){ }

	public String getProductName() {
		return name;

	}
	public void setProductName(String n) {
		this.name = n;
	}
	
	public String getProductSize() {
		return size;
	}
	public void setProductSize(String s) {
		this.size = s;
	}
	@Override
	public String toString()
	{
		return this.number+" "+this.name+" "+this.material+" "+this.size+" "+this.productOwner;
	}
	public String getProductMaterial() {
		return material;
	}
	public void setProductMaterial(String m) {
		this.material = m;
	}
	
	public boolean isExistence() {
		return existence;
	}
	public void setExistence(boolean e) {
		this.existence = e;
	}
	
	
	
	
	
	
	
}
