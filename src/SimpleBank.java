//package Operations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class SimpleBank {

	public static void main(String[] args) {
		
		// System.out.println("Working Directory = " + System.getProperty("user.dir") + "\n");
		
		// Operations op = new Operations("onboarding", null);
		
		try {
			Gson gson = new Gson();
			
			JsonReader reader = new JsonReader(new FileReader("./src/Operations/operations.json"));
			
			Operations[] operations = gson.fromJson(reader, Operations[].class);
			
			for(int i = 0; i < operations.length; i++) {
				System.out.println(operations[i].getType().toUpperCase());
				
				for (HashMap.Entry<?, ?> data : operations[i].getDetails().entrySet()) {
		            System.out.println(data.getKey() + ": " + data.getValue());
				}
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
