import java.awt.*;
import java.math.*;
public class Rectangle extends Shape {
    public double getArea() {
        return getArea();
    }

    public double getPerimeter() {
        return getPerimeter();
    }

    public  String toString() {
        System.out.println("String iz gut");
        return toString();
    }
    protected double width;
    protected double length;
    public Rectangle(){

    }
    public Rectangle(double width,double length){

    }
    public Rectangle(double width, double length,String color,boolean filled){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
