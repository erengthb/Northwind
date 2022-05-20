package kodlamaio.northwind.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> { 

	/* Jpa repository verdiğimiz veri tipi için yani entity annotasyonuyla
	 * süslenmiş veri için kullanılır
	 
	 * Integer primary key alanıdır
	 * CRUD operasyonları hazır
	*/
	
	
}
