package in.reno.mvnproject.maven_project;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.ProductDao;
import dao.ProductDaoImpl;
import dto.Product;

public class ProductTest {

	@Test
	public void test() {
		ProductDao productDao = new ProductDaoImpl();
		Product product = new Product();
		productDao.createProduct(product);
		List<Product> allProducts = productDao.getAllProducts();
		assertNotNull(allProducts);
			
		
	}
	
	public void test2() {
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.getProduct(1);
		String result = product.getName();
		assertEquals(result,"head set");
	}

}
