package Chapter67.e8;

import java.util.ArrayList;
import java.util.List;

public class DrawingApp {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    public Shape getShape(int index){
        return shapes.get(index);
    }

    public void drawAll(){
        shapes.forEach(Shape::draw);
    }
}
