import java.util.HashMap;

public class AccountOpening {
	
	private String name;
	private String documentNumber;
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
	
	
	public AccountOpening(String name, String documentNumber, 
			String birthdate, HashMap<?, ?> address, double income, String password) {
		
		this.name = name;
		this.documentNumber = documentNumber;
		this.birthdate = birthdate;
		this.address = address;
		this.income = income;
		this.password = password;
		
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getdocumentNumber() {
		return this.documentNumber;
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
