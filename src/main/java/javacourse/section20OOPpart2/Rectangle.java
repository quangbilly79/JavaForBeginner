package javacourse.section20OOPpart2;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height*width;
    }

    public double perimeter() {
        return (height+width)*2;
    }

}
