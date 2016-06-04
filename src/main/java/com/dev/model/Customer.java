package main.java.com.dev.model;

public class Customer {

	private String name;
	private String cellNumber;
	private String address;

	public Customer(String name, String cellNumber, String address) {
		super();
		this.name = name;
		this.cellNumber = cellNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
