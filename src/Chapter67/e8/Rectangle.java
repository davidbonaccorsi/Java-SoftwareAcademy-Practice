package Chapter67.e8;

public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height){
        System.out.println("Rectangle Constructor");
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }

    @Override
    public void move(double x, double y) {
        System.out.println("Rectangle Move");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Rectangle Resize");
        width *= factor;
        height *= factor;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}