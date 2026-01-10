package Chapter67.e10;

public class Main {

    public static void main(String[] args) {
        Order newOrder = new Order();
        System.out.println(newOrder.getStatus());
        newOrder.changeStatus(OrderStatus.SHIPPED);
        newOrder.changeStatus(OrderStatus.CANCELLED);
        System.out.println(newOrder.getStatus());
        newOrder.changeStatus(OrderStatus.SHIPPED);

        newOrder.printHistory();
    }
}
