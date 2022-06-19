package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //Controller tanımlaması
@RequestMapping("/api/products")   // kodlama.io/api/products

// RequestMapping 'in görevi dış dünyadan /api/products gibi bir istek gelirse aşşağıdaki controller karşılayacak

public class ProductsController {

	
	
	private ProductService productService ; //Dependency Incejtion
	
    @Autowired  /*
    
    Autowired burada kim ProductServiceyi implemente ediyorsa (ProductManager) onu buluyor
    ProductManager o = new ProductManager() işlemini yapıyor.
    ve buraya atıyor.
    
                  */
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	
	
	@GetMapping("/getall") // Veri istenen bir methodsa GetMapping  annotasyonu yazılır
	// kodlama.io/api/products/getall isteği gelirse aşşağıdaki List çalışacak
	
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
		
		
	}
	
	
	@PostMapping("/add")  //ekleme işlemleri bu annotasyonla yapılır
	public Result add(@RequestBody Product product) {   // RequestBody swaggerden execute dediğimizde girilen verileri json dosyasına döndürüp database kaydediyo
		
		return this.productService.add(product);
		
		
	}
	
	
}
