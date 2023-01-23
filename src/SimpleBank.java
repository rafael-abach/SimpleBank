import java.io.FileReader;

import java.io.IOException;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;

public class SimpleBank {

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
		
		System.out.println("Client " + operationDetails.get("name") + " Successfully Created.");
		System.out.println(operationDetails);
		
		return newOnb;
	}
	
	public static AccountClosing createAccountClosing() {
		
		return null;
	}
	
	public static Transaction createTransaction() {
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("Working Directory = " + System.getProperty("user.dir") + "\n");
		
		try {			
			Gson gson = new Gson();
			
			JsonReader opsReader = new JsonReader(new FileReader("./src/Operations/operations.json"));
			Operation[] operations = gson.fromJson(opsReader, Operation[].class);
			
			for (int i = 0; i < operations.length; i++) {
				operationDetails = operations[i].getDetails();
				
				if (operations[i].getType().equals("onboarding")) createOnboarding();
				if (operations[i].getType().equals("closing")) createAccountClosing();
				if (operations[i].getType().equals("cashin") || operations[i].getType().equals("cashout")) createTransaction();
				
				// System.out.println("Type of Operation: " + operations[i].getType().toUpperCase());
				
				//for (HashMap.Entry<?, ?> data : operations[i].getDetails().entrySet()) {
				//	System.out.println(data.getKey() + ": " + data.getValue());
				//}
				
				System.out.println();
			}
			
			opsReader.close();
			
		} 
		
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) {	e.printStackTrace(); }
		
	}

}
