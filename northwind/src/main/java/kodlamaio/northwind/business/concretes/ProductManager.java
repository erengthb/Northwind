package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
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
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
