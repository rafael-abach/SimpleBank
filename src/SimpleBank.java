//package Operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class SimpleBank {

	public static void main(String[] args) {
		
		try {
			Gson gson = new Gson();
			
			JsonReader reader = new JsonReader(new FileReader("C:\\Users\\Rafael A\\Documents\\Projects\\SimpleBank\\src\\Operations\\operation_1.json"));
			
			AccountOpening[] clients = gson.fromJson(reader, AccountOpening[].class);
			
			for (int i = 0; i < clients.length; i++) {System.out.println(clients[i].getdocumentNumber() + " - " + clients[i].getname());}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
