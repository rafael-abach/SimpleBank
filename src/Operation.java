import java.util.HashMap;

public class Operation {
	
	private String type;
	private HashMap<?, ?> details;
	
	public Operation(String type, HashMap<?, ?> details) {
		this.type = type;
		this.details = details;
	}

	
	public String getType() {
		return type;
	}
	
	public HashMap<?, ?> getDetails() {
		return details;
	}
	
}
