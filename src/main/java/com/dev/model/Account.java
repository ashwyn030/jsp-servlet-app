package main.java.com.dev.model;

public class Account {

	private String id;
	private String number;
	private double balance;
	private String status;
	private String nominee;

	public Account(String id, String number, double balance, String status) {
		super();
		this.id = id;
		this.number = number;
		this.balance = balance;
		this.status = status;
		this.nominee = nominee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

}
