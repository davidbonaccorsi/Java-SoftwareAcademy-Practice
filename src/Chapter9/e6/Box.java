package Chapter9.e6;

public class Box<T> {
    private T item;

    public Box(T type){
        this.item = type;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
