package stud.exception;

public class StudentException extends Exception{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String details;

	public StudentException(String details) {
		super();
		this.details = details;
	}

	public String getDetails() {
		return details;
	}
	
	
}
