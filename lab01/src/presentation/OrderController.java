package presentation;
import business.OrderService;

public class OrderController {
    private OrderService orderService;
    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void handleUserRequest(Long productId, int quantity) {
        try {
            orderService.placeOrder(productId, quantity);
            System.out.println("Order placed successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(" order failed " + e.getMessage());
        }
    }
}
