//package Operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class SimpleBank {

	public static void main(String[] args) {
		System.out.println("Teste");
		
		// Serialization
		Gson gson = new Gson();
		gson.toJson(1);            // ==> 1
		gson.toJson("abcd");       // ==> "abcd"
		gson.toJson(new Long(10)); // ==> 10
		int[] values = { 1 };
		gson.toJson(values);       // ==> [1]

		// Deserialization
		int i = gson.fromJson("1", int.class);
		Integer intObj = gson.fromJson("1", Integer.class);
		Long longObj = gson.fromJson("1", Long.class);
		Boolean boolObj = gson.fromJson("false", Boolean.class);
		String str = gson.fromJson("\"abc\"", String.class);
		String[] strArray = gson.fromJson("[\"abc\"]", String[].class);
		
		System.out.println(str);
		
		String filename = "operation_1.json";
		try {
			JsonReader reader = new JsonReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);

	}

}
