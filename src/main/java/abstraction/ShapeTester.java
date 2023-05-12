package abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
