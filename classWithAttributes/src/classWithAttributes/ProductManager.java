package classWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC
		System.out.println("Product Added " + product.getName());
	}
}
