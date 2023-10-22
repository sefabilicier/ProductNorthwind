package northwind.test.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import northwind.test.northwind.business.abstracts.ProductService;
import northwind.test.northwind.entites.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Product product) {
		this.productService.add(product);
	}
	
}
