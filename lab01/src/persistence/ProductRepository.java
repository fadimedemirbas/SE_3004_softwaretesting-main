package persistence;
import domain.Product;
import java.util.*;

public class ProductRepository {
    private Map<Long, Product>  productDatabase = new HashMap<>();

    public Product findById(Long id) {
        return productDatabase.get(id);
    }
    
    public void save(Product product) {
        productDatabase.put(product.getId(), product);
    }
}
//bussines layer
