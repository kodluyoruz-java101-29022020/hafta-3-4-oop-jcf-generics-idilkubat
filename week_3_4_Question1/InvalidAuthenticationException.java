package week_3_4_Question1;


public class InvalidAuthenticationException extends Exception {
	
	private AuthenticationStatus status;
	
	private int errorCode;
	private String errorMessage;
	
	public InvalidAuthenticationException(int errorCode, String errorMessage) {
		
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
