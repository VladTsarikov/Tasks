package by.htp.shop.domain;

public class Customer   {

	private int id;
	private String secondName;
	private String FirstName;
	private String middleName;
	private String adress;
	private int creditCard;
	private int bankAccount;
	
	
	

	
	public Customer(int id, String secondName, String firstName,
			String middleName, String adress, int creditCard, int bankAccount) {
		super();
		this.id = id;
		this.secondName = secondName;
		this.FirstName = firstName;
		this.middleName = middleName;
		this.adress = adress;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
		
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	public int getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	 
}
