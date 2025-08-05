public class Main {
    public static void main(String[] args) {
        GeometricForm circle = new Circle(5);
        GeometricForm rectangle = new Rectangle(4, 6);
        GeometricForm square = new Square(3, 3);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}
