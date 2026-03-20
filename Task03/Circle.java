package Lab08_Tasks.Task03;

public class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
