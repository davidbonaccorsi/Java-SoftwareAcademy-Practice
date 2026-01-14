package Chapter6.e14;

class Order {
    String id;
    double price;
    boolean isActive;

    public Order(String id, double price, boolean isActive) {
        this.id = id; this.price = price; this.isActive = isActive;
    }
    public boolean isActive() { return isActive; }
    public double getPrice() { return price; }
}
