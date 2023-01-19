import java.util.HashMap;

public class AccountOpening {
	
	private String documentNumber;
	private String name;
	private String birthdate;
	private HashMap<?, ?> address;
	private double income;
	private String password;
	
	//	private String country;
	//	private String state;
	//	private String city;
	//	private String postalCode;
	//	private String address;
	//	private int addressNumber;
	//	private String addressComplement;
	
	//  String country,
	//  String state,
	//  String city,
	//  String postalCode,
	//  String address,
	//  int addressNumber,
	//  String addressComplement,
	//  double income,
	//  String password

	//	this.country = country;
	//	this.state = state;
	//	this.city = city;
	//	this.postalCode = postalCode;
	//	this.address = address;
	//	this.addressNumber = addressNumber;
	//	this.addressComplement = addressComplement;
	
	
	public AccountOpening(String documentNumber, String name, String birthdate, HashMap<?, ?> address, double income, String password) {
		
		this.documentNumber = documentNumber;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.income = income;
		this.password = password;
		
	}
	
	public String getdocumentNumber() {
		return this.documentNumber;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public HashMap<?, ?> getAddress() {
		return address;
	}
	
	public double getIncome() {
		return income;
	}
	
	// Delete
	public String getPassword() {
		return password;
	}
}
