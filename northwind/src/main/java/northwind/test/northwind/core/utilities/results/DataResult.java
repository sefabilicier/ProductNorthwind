package northwind.test.northwind.core.utilities.results;

public class DataResult <T> extends Result {

	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
		// TODO Auto-generated constructor stub
	}


	public DataResult(boolean success, T data) {
		super(success);
		this.data = data;
	}


	public T getData() {
		return this.data;
	}

}
