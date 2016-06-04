package main.java.com.dev.model;

public class Employee extends Customer {
	
	public Employee(String name, String cellNumber, String address) {
		super(name, cellNumber, address);
		// TODO Auto-generated constructor stub
	}

	private String associateId;

	/**
	 * @return the associateId
	 */
	public String getAssociateId() {
		return associateId;
	}

	/**
	 * @param associateId the associateId to set
	 */
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

}
