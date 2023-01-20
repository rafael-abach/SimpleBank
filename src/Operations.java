import java.util.HashMap;

public class Operations {
	
	private String type;
	private HashMap<?, ?> details;
	
	public Operations(String type, HashMap<?, ?> details) {
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
