package northwind.test.northwind.entites.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "supplier_id")
	private int supplierId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "units_on_order")
	private int unitsOnOrder;
	
	@Column(name = "reorder_level")
	private int reorderLevel;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	
	
	public Product(){}
	
	
}
