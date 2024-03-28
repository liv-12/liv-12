package shapes;

public class MainShapes {
    public static <rectangle> void main(String[] args) {
        // Create objects of Circle and Rectangle

        Circle circle = new Circle (5);
        Rectangle rectangle = new Rectangle (4, 6);

        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());


    }
}
