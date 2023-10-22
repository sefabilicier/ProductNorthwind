package northwind.test.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import northwind.test.northwind.business.abstracts.ProductService;
import northwind.test.northwind.dataAccess.abstracts.ProductDao;
import northwind.test.northwind.entites.concretes.Product;

@Service 
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

	@Override
	public void add(Product product) {
		this.productDao.save(product);
		return;
	}

}
