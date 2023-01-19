//package Operations;

// import java.io.File; the import is never used

import java.io.FileReader;

import java.io.IOException;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class SimpleBank {

	public static void main(String[] args) {
		
		try {
			System.out.println("Working Directory = " + System.getProperty("user.dir") + "\n");
			
			JsonReader reader = new JsonReader(new FileReader("./src/Operations/ops_account_opening.json"));
			
			Gson gson = new Gson();
			AccountOpening[] clients = gson.fromJson(reader, AccountOpening[].class);
			
			for (int i = 0; i < clients.length; i++) {
				System.out.println("Name: " + clients[i].getname());
				System.out.println("Document Number: " + clients[i].getdocumentNumber());
				System.out.println("Country: " + clients[i].getAddress().get("country"));
				System.out.println("State: " + clients[i].getAddress().get("state"));
				System.out.println("City: " + clients[i].getAddress().get("city"));
				System.out.println("Postal Code: " + clients[i].getAddress().get("postalCode"));
				System.out.println("Address: " + clients[i].getAddress().get("address"));
				System.out.println("Address Number: " + clients[i].getAddress().get("addressNumber"));
				System.out.println("Address Complement: " + clients[i].getAddress().get("addressComplement"));
				System.out.println("Income ($): " + clients[i].getIncome());
				System.out.println("Password: " + clients[i].getPassword());
				System.out.println();
			}
			
			reader.close();
			
		} 
		
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) {	e.printStackTrace(); }
	
		System.out.println("Test");
		
	}

}
