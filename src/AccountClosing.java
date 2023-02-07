
public class AccountClosing {
	private String documentNumber;
	private String password;
	
	public AccountClosing(String documentNumber, String password) {
		this.documentNumber = documentNumber;
		this.password = password;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	public String getPassword() {
		return password;
	}
}
