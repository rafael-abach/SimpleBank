//package Operations;

// import java.io.File; the import is never used

import java.io.FileReader;

import java.io.IOException;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;

public class SimpleBank {

	public static void main(String[] args) {
		// System.out.println("Working Directory = " + System.getProperty("user.dir") + "\n");
		
		try {			
			Gson gson = new Gson();
			
			JsonReader opsReader = new JsonReader(new FileReader("./src/Operations/operations.json"));
			Operations[] operations = gson.fromJson(opsReader, Operations[].class);
			
			for (int i = 0; i < operations.length; i++) {
				System.out.println("Type of Operation: " + operations[i].getType().toUpperCase());
				
				// operations[i].getDetails().forEach((k,v) -> System.out.println(k + ": " + v));
				for (HashMap.Entry<?, ?> data : operations[i].getDetails().entrySet()) {
		            System.out.println(data.getKey() + ": " + data.getValue());
				}
				
				// if (type == "onboarding") { ... }
				// if (type == "cashin") { ... }
				// if (type == "cashout") { ... }
				// if (type == "closing") { ... }
				
				System.out.println();
			}
			
			opsReader.close();
			
		} 
		
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) {	e.printStackTrace(); }
		
	}

}
