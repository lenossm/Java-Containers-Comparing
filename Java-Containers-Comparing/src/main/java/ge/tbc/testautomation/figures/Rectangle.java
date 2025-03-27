package ge.tbc.testautomation.figures;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", area=" + getArea() + "}";
    }
}
