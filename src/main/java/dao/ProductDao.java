package dao;

import java.util.List;

import dto.Product;

public interface ProductDao {

	void createProduct(Product product);

	Product getProduct(Integer id);
	
	List<Product> getAllProducts();
}
