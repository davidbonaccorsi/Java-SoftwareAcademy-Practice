package Chapter67.e14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrderProcessor {

    /**
     * TODO: Implement this method using the Functional Interfaces.
     * Logic:
     * For each order in the list:
     * 1. Check if it passes the 'filter'.
     * 2. If yes, use 'mapper' to convert it to a Double.
     * 3. Finally, use 'action' to process that Double.
     */
    public static void processOrders(
            List<Order> orders,
            Predicate<Order> filter,
            Function<Order, Double> mapper,
            Consumer<Double> action
    ) {
        for(Order order : orders){
            if(filter.test(order)){
                Double amount = mapper.apply(order);
                action.accept(amount);
            }
        }
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ORD-1", 100.0, true));
        orders.add(new Order("ORD-2", 50.0, false)); // Inactive
        orders.add(new Order("ORD-3", 200.0, true));

        // TODO: Call processOrders
        // 1. Filter: Use a Method Reference to Order::isActive
        // 2. Mapper: Use a Method Reference to Order::getPrice
        // 3. Action: Use a Lambda that prints "Processed Amount: $" + amount

        System.out.println("--- Processing Orders ---");
        // processOrders(orders, ... , ... , ... );
        processOrders(orders, Order::isActive, Order::getPrice, amount -> System.out.println("Processed Amount: $" + amount));
    }
}
