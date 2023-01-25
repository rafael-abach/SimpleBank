import java.io.FileReader;

import java.io.IOException;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;

public class SimpleBank {

	static String operationType;
	static HashMap<?, ?> operationDetails;
	
	public static Onboarding createOnboarding() {
		Onboarding newOnb = new Onboarding((String) operationDetails.get("name"), 
										   (String) operationDetails.get("documentNumber"), 
										   (String) operationDetails.get("birthdate"), 
										   (String) operationDetails.get("country"), 
										   (String) operationDetails.get("city"), 
										   (String) operationDetails.get("postalCode"), 
										   (String) operationDetails.get("address"), 
										   (Double) operationDetails.get("addressNumber"), 
										   (String) operationDetails.get("addressComplement"), 
										   (Double) operationDetails.get("income"), 
										   (String) operationDetails.get("password"), 
										   (String) operationDetails.get("onboardingDate"), 
										   (String) operationDetails.get("onboardingTimestamp"));
		
		System.out.println("Onboarding for " + newOnb.getName() + " Successfully Created.");
		
		return newOnb;
	}
	
	public static AccountClosing createAccountClosing() {
		AccountClosing newClose = new AccountClosing((String) operationDetails.get("documentNumber"), 
													 (String) operationDetails.get("password"));
		
		System.out.println("Account " + newClose.getDocumentNumber() + " Successfully Closed.");
		
		return newClose;
	}
	
	public static Transaction createTransaction(String type) {
		Transaction newTrans = new Transaction((String) type,
											   (String) operationDetails.get("originDocumentNumber"), 
											   (String) operationDetails.get("destinyDocumentNumber"), 
											   (Double) operationDetails.get("transactionValue"), 
											   (String) operationDetails.get("transactionDate"), 
											   (String) operationDetails.get("transactionTimestamp"), 
											   (String) operationDetails.get("originBankID"), 
											   (String) operationDetails.get("destinyBankID"));
		
		System.out.println(newTrans.getType().toUpperCase() + " Transaction " + "($ " + newTrans.getTransactionValue() + ") Successfully Processed." );
		
		return newTrans;
	}
	
	public static void main(String[] args) {
		System.out.println("Working Directory = " + System.getProperty("user.dir") + "\n");
		
		try {			
			Gson gson = new Gson();
			
			JsonReader opsReader = new JsonReader(new FileReader("./src/Operations/operations.json"));
			Operation[] operations = gson.fromJson(opsReader, Operation[].class);
			
			for (int i = 0; i < operations.length; i++) {
				operationType = operations[i].getType();
				operationDetails = operations[i].getDetails();
				
				if (operationType.equals("onboarding")) createOnboarding();
				if (operationType.equals("closing")) createAccountClosing();
				if (operationType.equals("cashin") || operationType.equals("cashout")) createTransaction(operationType);
				
				System.out.println(operationDetails);
				System.out.println();
			}
			
			opsReader.close();
			
		} 
		
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) {	e.printStackTrace(); }
		
	}

}
