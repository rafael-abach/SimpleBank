//package Operations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class SimpleBank {

	public static void main(String[] args) {
		
		// System.out.println("Working Directory = " + System.getProperty("user.dir") + "\n");
		
		try {
			Gson gson = new Gson();
			
			JsonReader reader = new JsonReader(new FileReader("./src/Operations/ops_account_opening.json"));
			
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
				System.out.println("Map: " + clients[i].getAddress());
				System.out.println();
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Erro generico");
			e.printStackTrace();
		}
	}

}
