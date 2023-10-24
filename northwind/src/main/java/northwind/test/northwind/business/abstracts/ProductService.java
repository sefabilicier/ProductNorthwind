package northwind.test.northwind.business.abstracts;

import java.util.List;

import northwind.test.northwind.core.utilities.results.DataResult;
import northwind.test.northwind.core.utilities.results.Result;
import northwind.test.northwind.entites.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();
	Result add(Product product);
	
}
