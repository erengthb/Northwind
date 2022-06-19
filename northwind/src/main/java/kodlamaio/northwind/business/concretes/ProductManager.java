package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAcces.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;


@Service // bu class service görevi görecek demektir.
public class ProductManager implements ProductService {

	//Data acces katmanındaki productDao ya erişmemiz gerekiyor
	
	private ProductDao productDao;
	
	
	@Autowired  // Spring arka planda  ProductDao nun instancesi olabilecek bir sınıfı üretir
	public ProductManager(ProductDao productDao) { //dependency injection
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>>  getAll() {
		// TODO Auto-generated method stub
		return  new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Başarıyla Listelendi");  
				
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);                    // jpa daki save metodu ekleme yapar
		return new SuccessResult("Ürün Eklendi");
	}

}
