package Polymorphism.Shapes_02;

public class Circle extends Shape{
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public Double calculatePerimeter() {
        if(perimeter == null){
            return 2 * Math.PI * radius;
        }
        return perimeter;
    }

    public Double getPerimeter(){
        return calculatePerimeter();
    }

    @Override
    public Double calculateArea() {
        if(area == null){
            return Math.PI * radius * radius;
        }
        return area;
    }

    public Double getArea(){
        return calculateArea();
    }
}
