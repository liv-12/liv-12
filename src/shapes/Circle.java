package shapes;


class Circle extends Shape {
    double radius;
    public Circle (double radius ){
        this.radius=radius;

    }

    public double calculateArea() {
        return Math.PI * radius * radius ;



    }
}
