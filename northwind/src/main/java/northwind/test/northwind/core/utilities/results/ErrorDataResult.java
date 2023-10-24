package northwind.test.northwind.core.utilities.results;

public class ErrorDataResult <T> extends DataResult<T> {

	public ErrorDataResult(T data, boolean success, String message) {
		super(data, success, message);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDataResult(T data) {
		super(false, data);
	}

	public ErrorDataResult(String messsage) {
		super(null, false, messsage);
	}
	
	public ErrorDataResult() {
		super(false, null);
	}
}
