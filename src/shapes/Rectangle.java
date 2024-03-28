package shapes;

public class Rectangle {

    double lenght;
    double width;

    public Rectangle(double length, double width) {
        this.lenght = length;
        this.width = width;

    }

    public double calculateArea() {
        return lenght * width;


    }
}
