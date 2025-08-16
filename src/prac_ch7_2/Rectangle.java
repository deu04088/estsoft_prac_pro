package prac_ch7_2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width*this.height;
    }
}
