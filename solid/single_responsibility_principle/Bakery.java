package solid.single_responsibility_principle;

/*
                        Single Responsibility principle
 This principle states that A class should have only one reason to change which means
 every class should have a single responsibility or single job or single purpose. In
 other words, a class should have only one job or purpose within the software system.
 */


//class for baking bread
class BreadBaker{
    public void bakeBread(){
        System.out.println("Bread Bakery");
    }
}

//class for managing inventory
class InventoryManager{
    public void manageInventory(){
        System.out.println("Inventory Manager");
    }
}

//class for ordering supplies
class SupplyOrder{
    public  void orderSupplies(){
        System.out.println("Supply Order");
    }
}

//class for serving customers
class CustomerService{
    public void serveCustomer(){
        System.out.println("Customer Service");
    }
}

//class for cleaning the bakery
class BakeryCleaner{
    public void cleanBakery(){
        System.out.println("Bakery Cleaner");
    }
}

public class Bakery {
    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        CustomerService customerService = new CustomerService();
        BakeryCleaner cleaner = new BakeryCleaner();

        //Each class focuses on its specific responsibility
        baker.bakeBread();
        inventoryManager.manageInventory();
        supplyOrder.orderSupplies();
        customerService.serveCustomer();
        cleaner.cleanBakery();

    }
}
