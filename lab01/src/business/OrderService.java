package business;
import domain.Product;
import persistence.ProductRepository;

public class OrderService {
    private ProductRepository productRepository;
    
    public OrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    public void placeOrder(Long productId, int quantity) {
        Product product = productRepository.findById(productId);
        if (product == null) {
            throw new IllegalArgumentException("Product not found");
        }
        if (product.getStock() < quantity) {
            throw new IllegalArgumentException("Insufficient stock");
        }
        product.setStock(product.getStock() - quantity);
        productRepository.save(product);
    }
}
