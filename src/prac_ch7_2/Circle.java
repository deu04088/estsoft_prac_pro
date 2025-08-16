package prac_ch7_2;

public class Circle extends Shape {
    private int rad;
    Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public double getArea(){
        return this.rad*this.rad*3.14;
    }
}
