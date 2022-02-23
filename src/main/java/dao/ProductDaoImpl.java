package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Product;

public class ProductDaoImpl implements ProductDao {

	public static List<Product> productList = new ArrayList<>();

	@Override
	public void createProduct(Product product) {
		product.setCost(50);
		product.setId(1);
		product.setName("head set");
		productList.add(product);

	}

	@Override
	public Product getProduct(Integer id) {
		Product requiredProduct = null;
		for (Product prod : productList) {
			if (prod.getId() == id) {
				requiredProduct = prod;
				break;
			}
		}
		return requiredProduct;
	}

	@Override
	public List<Product> getAllProducts() {
		return productList;
	}

}
