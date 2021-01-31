package assignmentThree;

public class Customer {
	String name;
	String Address;
	Account acc;
	
	public Customer(String name, String address, Account acc) {
		super();
		this.name = name;
		this.Address = address;
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
}
