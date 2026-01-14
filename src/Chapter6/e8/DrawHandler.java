package Chapter6.e8;

public class DrawHandler {

    public static void main(String[] args){
        DrawingApp drawingApp = new DrawingApp();
        drawingApp.addShape(new Circle(5));
        drawingApp.addShape(new Rectangle(4,6));
        drawingApp.drawAll();

        Shape firstShape = drawingApp.getShape(1);
        System.out.println(firstShape.getArea());
    }
}
