package Polymorphism.Shapes_02;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.00, 4.00);
        Shape circle = new Circle(13.4);

        printShape(rectangle);
        printShape(circle);

    }
    private static void printShape(Shape shape){
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());
    }
}
