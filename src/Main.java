package hw1DanielK;
public class Main {
    public static void main(String[] args) {
        // Create dishes
        FinalMeal pasta = new FinalMeal("Spaghetti Carbonara", 14.99, "Spaghetti, eggs, pancetta, cheese, pepper");
        FinalMeal pizza = new FinalMeal("Margherita Pizza", 11.99, "Tomato, mozzarella, basil");
        FinalMeal salad = new FinalMeal("Caesar Salad", 9.49, "Lettuce, croutons, parmesan, Caesar dressing");

        // Create customers
        Customer customer1 = new Customer("Alice", 5);
        Customer customer2 = new Customer("Bob", 3);
        Customer customer3 = new Customer("Eve", 8);

        // Create an order queue
        OrderQueue kitchenQueue = new OrderQueue();

        // Add orders
        kitchenQueue.addOrder(pasta);
        kitchenQueue.addOrder(pizza);
        kitchenQueue.addOrder(salad);

        // Process orders
        System.out.println("\n--- Processing All Orders ---\n");
        kitchenQueue.processAllOrders();

        // Print customer info
        System.out.println("\n--- Customers ---");
        System.out.println("Customer: " + customer1.name() + " at Table: " + customer1.tableNumber());
        System.out.println("Customer: " + customer2.name() + " at Table: " + customer2.tableNumber());
        System.out.println("Customer: " + customer3.name() + " at Table: " + customer3.tableNumber());
    }
}


















