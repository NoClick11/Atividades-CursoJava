package entities;

public class Rectangle {
    public Double width;
    public Double height;

    public Double Area() {
        return width*height;
    }

    public Double Perimeter() {
        return width*2 + height*2;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
