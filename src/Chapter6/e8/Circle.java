package Chapter6.e8;

public class Circle implements Shape{

    private double area;

    public Circle(double area){
        System.out.println("Circle Constructor");
        this.area = area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void move(double x, double y) {
        System.out.println("Moving the circle");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Resizing the circle");
        this.area *= factor;
    }

    @Override
    public double getArea() {
        return Math.PI * this.area * this.area;
    }
}
