import java.util.HashMap;

public class AccountOpening {
	
	private String name;
	private String documentNumber;
	private String birthdate;
	private HashMap<?, ?> address;
	private double income;
	private String password;
	
	public AccountOpening(String name,
					      String documentNumber,
						  String birthdate,
						  HashMap<?, ?> address,
						  double income,
						  String password) {
		
		this.name =  name;
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
	public String getPassword() {
		return password;
	}
}
