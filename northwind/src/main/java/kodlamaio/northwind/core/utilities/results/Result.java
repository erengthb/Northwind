package kodlamaio.northwind.core.utilities.results;

public class Result {  // super type yani aslında interface görevi görür tek başına da iş görür
	
	private boolean success;
	private String message;
	
	public Result(boolean success) {
			this.success=success;		
	}
	
    public Result(boolean success,String message) {
    	this(success);	
    	this.message=message;
			
		
	}
	
    public boolean isSucces() {
    	
    	return this.success;
    	
    }
    
    public String getMessage() {
    	
    	
    	return this.message;
    	
    }
    

}
