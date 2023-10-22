package northwind.test.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import northwind.test.northwind.entites.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	
}
