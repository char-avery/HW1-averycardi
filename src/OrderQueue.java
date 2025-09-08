package hw1DanielK;
import java.util.LinkedList;
import java.util.Queue;

	public class OrderQueue {
	    private final Queue<FinalMeal> orderQueue = new LinkedList<>();

	    public void addOrder(FinalMeal dish) {
	        orderQueue.add(dish);
	        System.out.println("Order added: " + dish.getname());
	    }

	    public void processNextOrder() {
	        if (orderQueue.isEmpty()) {
	            System.out.println("No orders to process.");
	            return;
	        }

	        FinalMeal dish = orderQueue.poll();
	        System.out.println("Processing order: " + dish.getname());
	        dish.Prepare();
	    }

	    public void processAllOrders() {
	        while (!orderQueue.isEmpty()) {
	            processNextOrder();
	        }
	    }
}
