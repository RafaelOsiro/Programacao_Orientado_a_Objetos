package Model;

public class AccountModel {

	PersonModel accountHolder = new PersonModel();
	private String accountNumber;
	private double banlance;
	
	public PersonModel getAccountHolder() {
		return accountHolder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String bankAccountNumber) {
		this.accountNumber = bankAccountNumber;
	}
	
	public double getBanlance() {
		return banlance;
	}
	
	public void setBanlance(double banlance) {
		this.banlance = banlance;
	}
}
