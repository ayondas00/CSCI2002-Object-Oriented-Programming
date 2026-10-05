package JavaProject;

enum OrderStatus {
	   PENDING,
	   SHIPPED,
	   DELIVERED,
	   CANCELLED
	}
	public class Order {
	   private String orderId;
	   private OrderStatus status;
	   public Order(String orderId, OrderStatus status) {
	       this.orderId = orderId;
	       this.status = status;
	   }
	   public static void main(String[] args) {
	       Order order = new Order("ORD101", OrderStatus.DELIVERED);
	       Order orderone = new Order("ORD102", OrderStatus.CANCELLED);
	       System.out.println("Order ID: " + order.orderId);
	       System.out.println("Order Status: " + order.status);
	       System.out.println("Order ID: " + orderone.orderId);
	       System.out.println("Order Status: " + orderone.status);
	   }
	}
