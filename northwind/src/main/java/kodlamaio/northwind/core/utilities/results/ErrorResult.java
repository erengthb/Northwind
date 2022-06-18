package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	
	public ErrorResult() {
		super(false);  // base sınıfın constructor unu çalıştırmaya yarar
		
	}
	
	public ErrorResult(String message) {
		super(false,message);
		
	}
	
	
}
