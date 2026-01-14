package Chapter6.e8;

public class Triangle implements Shape{

    private double width;
    private double base;

    public Triangle(double width, double base){
        System.out.println("Triangle Constructor");
        this.width = width;
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }

    @Override
    public void move(double x, double y) {
        System.out.println("Triangle Move");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Triangle Resize");
        this.base *= factor;
        this.width *= factor;
    }

    @Override
    public double getArea() {
        return (width * base) / 2;
    }

}
