package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>>  getAll(); //tüm productları gezer  //Data nın türünün list<product>olduğunu söylüyoruz
	
	Result add(Product product); 
	
	
}
