package solid.dependency_inversion_principle;

/*
                            Dependency Inversion Principle
 The Dependency Inversion Principle (DIP) is a principle in object-oriented design
 that states that High-level modules should not depend on low-level modules. Both
 should depend on abstractions. Additionally, abstractions should not depend on
 details. Details should depend on abstractions.

In simpler terms, the DIP suggests that classes should rely on abstractions (e.g.,
interfaces or abstract classes) rather than concrete implementations. This allows
for more flexible and decoupled code, making it easier to change implementations
without affecting other parts of the codebase.
 */

interface NotificationService{
    void sendNotification(String message);
}

interface LoggingService{
    void logMessage(String message);
    void logError(String message);
}

interface InventoryService{
    void updateStock(Order order);
    boolean checkAvailability(Product product);
}

class Product {

    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int qty) {
        this.quantity -= qty;
    }
}

class Order {

    private int id;
    private Product product;
    private int quantity;

    public Order(int id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

class EmailNotifier implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

class SMSNotifier implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

class PushNotifier implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

class DatabaseLogger implements LoggingService{
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
    @Override
    public void logError(String message) {
        System.out.println(message);
    }
}

class WarehouseInventoryService implements InventoryService {
    @Override
    public void updateStock(Order order) {
        Product product = order.getProduct();

        product.reduceQuantity(order.getQuantity());

        System.out.println("Stock updated. Remaining quantity: " + product.getQuantity());
    }
    @Override
    public boolean checkAvailability(Product product) {
        if (product.getQuantity() > 0) {
            return true;
        }

        System.out.println("Product out of stock");
        return false;
    }
}

class OrderService {
    private final NotificationService notificationService;
    private final LoggingService loggingService;
    private final InventoryService inventoryService;

    public OrderService(NotificationService notificationService, LoggingService loggingService, InventoryService inventoryService) {
        this.notificationService = notificationService;
        this.loggingService = loggingService;
        this.inventoryService = inventoryService;
    }

    public void placeOrder(Order order){
        try {
            if (inventoryService.checkAvailability(order.getProduct())){
                inventoryService.updateStock(order);
                notificationService.sendNotification("Order #"+ order.getId() +" placed successfully");
                loggingService.logMessage("Order placed successfully " + order.getId());
            }
        }catch (Exception e){
            loggingService.logError("Error while placing order " + order.getId() + " - " + e.getMessage());
        }
    }
}

public class DIP {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", 10);
        Order order = new Order(101, product, 2);
        NotificationService notifier = new EmailNotifier();
        LoggingService logger = new DatabaseLogger();
        InventoryService inventory = new WarehouseInventoryService();

        OrderService orderService = new OrderService(notifier, logger, inventory);

        orderService.placeOrder(order);
    }
}
