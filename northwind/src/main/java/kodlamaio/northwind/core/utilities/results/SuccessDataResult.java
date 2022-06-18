package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult <T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data, true , message); // base sınıfın constructoru
		
	}

	public SuccessDataResult(T data) { // sadece data ve success bilgisini de bu şekilde gönderebiliriz
		
		super(data,true);
		
	}
	
	public SuccessDataResult( String message) {
		super(null , true ,message); // base sınıfın constructoru
		
	}
	
	
}
