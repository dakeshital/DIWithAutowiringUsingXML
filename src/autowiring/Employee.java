package autowiring;

public class Employee {

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {

	}

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void show() {
		System.out.println("Emloyee Name: "+ name);
		System.out.println("Emloyee Address: "+ address.toString());

	}
}
