package northwind.test.northwind.core.utilities.results;

public class SuccessResult extends Result {

	public SuccessResult(boolean success) {
		super(true); //instead of this, super is given for the class extended 
		// TODO Auto-generated constructor stub
	}
	
	public SuccessResult(boolean success, String message) {
		super(true, message);
		// TODO Auto-generated constructor stub
	}

	
}
