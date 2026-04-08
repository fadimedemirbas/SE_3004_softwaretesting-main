import domain.Product;
import presentation.OrderController;
import business.OrderService;
import persistence.ProductRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 System Starting...\n");

        ProductRepository productRepository = new ProductRepository();

        Product laptop = new Product(1L, "Laptop", 5);
        productRepository.save(laptop);

        OrderService orderService = new OrderService(productRepository);

        OrderController controller = new OrderController(orderService);

        System.out.println("--- Test Scenarios ---");
        controller.handleUserRequest(1L, 2);
        controller.handleUserRequest(1L, 10);
        controller.handleUserRequest(2L, 1);
    }
}