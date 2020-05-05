package week_3_4_Question1;

public enum AuthenticationStatus {
	
	SUCCESS(202,"The Authentication Status is success"),  
	FAIL(404,"The Authentication Status is fail");
	
	

	private final String description;
	private final int code;

	AuthenticationStatus(int code, String description) {
		// TODO Auto-generated constructor stub
		
		this.description = description;		
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}

}
