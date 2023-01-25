public class Transaction {

	private String type;
	private String originDocumentNumber;
	private String destinyDocumentNumber;
	private double transactionValue;
	private String transactionDate;
	private String transactionTimestamp;
	private String originBankID;
	private String destinyBankID;
	
	public Transaction(String type,
					   String originDocumentNumber, 
					   String destinyDocumentNumber, 
					   double transactionValue, 
					   String transactionDate, 
					   String transactionTimestamp, 
					   String originBankID,
					   String destinyBankID) {
		
		this.type = type;
		this.originDocumentNumber = originDocumentNumber;
		this.destinyDocumentNumber = destinyDocumentNumber;
		this.transactionValue = transactionValue;
		this.transactionDate = transactionDate;
		this.transactionTimestamp = transactionTimestamp;
		this.originBankID = originBankID;
		this.destinyBankID = destinyBankID;
	
	}
	
	public String getType() {
		return type;
	}
	
	public String getOriginDocumentNumber() {
		return originDocumentNumber;
	}
	
	public String getDestinyDocumentNumber() {
		return destinyDocumentNumber;
	}
	
	public double getTransactionValue() {
		return transactionValue;
	}
	
	public String getTransactionDate() {
		return transactionDate;
	}
	
	public String getTransactionTimestamp() {
		return transactionTimestamp;
	}
	
	public String getOriginBankID() {
		return originBankID;
	}
	
	public String getDestinyBankID() {
		return destinyBankID;
	}
	
}
