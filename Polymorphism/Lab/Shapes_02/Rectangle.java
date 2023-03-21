package Polymorphism.Shapes_02;

public class Rectangle extends Shape{

    private final Double height;
    private final Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    @Override
    public Double calculatePerimeter() {
        if(perimeter == null){
            return 2 * height + 2 * width;
        }
        return perimeter;
    }

    @Override
    public Double calculateArea() {
        if(area == null){
            return height * width;
        }
        return area;
    }

    public Double getPerimeter(){
        return calculatePerimeter();
    }

    public Double getArea(){
        return calculateArea();
    }
}
