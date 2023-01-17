
public class AccountOpening {
	private String documentNumber;
	private String name;
	private String birthdate;
	private String country;
	private String state;
	private String city;
	private String postalCode;
	private String address;
	private int addressNumber;
	private String addressComplement;
	private double income;
	private String password;
	
	public AccountOpening(String documentNumber,
					      String name,
						  String birthdate,
					      String country,
					      String state,
						  String city,
						  String postalCode,
						  String address,
						  int addressNumber,
					      String addressComplement,
						  double income,
						  String password) {
		
		this.documentNumber = documentNumber;
		this.name = name;
		this.birthdate = birthdate;
		this.country = country;
		this.state = state;
		this.city = city;
		this.postalCode = postalCode;
		this.address = address;
		this.addressNumber = addressNumber;
		this.addressComplement = addressComplement;
		this.income = income;
		this.password = password;
		
	}
	
	public String getAddress() {
		return address;
	}
}
