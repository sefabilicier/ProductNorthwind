package northwind.test.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import northwind.test.northwind.core.utilities.results.SuccessDataResult;
import northwind.test.northwind.business.abstracts.ProductService;
import northwind.test.northwind.core.utilities.results.DataResult;
import northwind.test.northwind.core.utilities.results.Result;
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
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listlendi!");	
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessDataResult<>("Product added");
	}

}
