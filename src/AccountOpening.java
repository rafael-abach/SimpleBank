public class AccountOpening {
	
	private String name;
	private String documentNumber;
	private String birthdate;
	private String country;
	private String city;
	private String postalCode;
	private String address;
	private double addressNumber;
	private String addressComplement;
	private double income;
	private String password;
	private String onboardingDate;
	private String onboardingTimestamp;
	
	public AccountOpening(String name,
					  String documentNumber,
					  String birthdate,
					  String country,
					  String city,
					  String postalCode,
					  String address,
					  double addressNumber,
					  String addressComplement,
					  double income,
					  String password,
					  String onboardingDate,
					  String onboardingTimestamp) {
		
		this.name = name;
		this.documentNumber = documentNumber; 
		this.birthdate = birthdate;
		this.country = country;
		this.city = city;
		this.postalCode = postalCode; 
		this.address = address;
		this.addressNumber = addressNumber;
		this.addressComplement = addressComplement;
		this.income = income;
		this.password = password;
		this.onboardingDate = onboardingDate;
		this.onboardingTimestamp = onboardingTimestamp;
	
	}
	
	public String getName() {
		return name;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getAddressNumber() {
		return addressNumber;
	}
	
	public String getAddressComplement() {
		return addressComplement;
	}
	
	public double getIncome() {
		return income;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getOnboardingDate() {
		return onboardingDate;
	}
	
	public String getOnboardingTimestamp() {
		return onboardingTimestamp;
	}
	
}