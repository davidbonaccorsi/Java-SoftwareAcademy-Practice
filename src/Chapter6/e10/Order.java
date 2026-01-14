package Chapter6.e10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order{

    private OrderStatus currentStatus;
    private final List<String> statusHistory = new ArrayList<>();

    public Order(){
        this.currentStatus = OrderStatus.PENDING;
        statusHistory.add(LocalDateTime.now() + ": Order created");
    }

    private void addToHistory(OrderStatus oldStatus){
        String log = LocalDateTime.now() + ": Order status changed from " + oldStatus + " to " + currentStatus;
        statusHistory.add(log);
    }

    public void printHistory(){
        System.out.println("Order status history:");
        statusHistory.forEach(System.out::println);
        System.out.println("End of history");
    }

    public OrderStatus getStatus() {
        return currentStatus;
    }

    public void changeStatus(OrderStatus newStatus){
        if(newStatus != null && currentStatus.canTransitionTo(newStatus)){
            OrderStatus oldStatus = this.currentStatus;
            this.currentStatus = newStatus;
            addToHistory(oldStatus);
            System.out.println("Order status changed to " + newStatus);
        }
    }
}
