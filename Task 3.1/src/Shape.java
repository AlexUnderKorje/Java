import java.awt.*;
import java.math.*;
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

    protected String color;
    protected boolean filled;
    public Shape(){

    }
    public Shape(String color, boolean filled){

    }
    public String getColor(){
       return getColor();
    }
    public void setColor (String color){
       this.color = color;
    }
    public boolean isFilled(){
       return  isFilled();
    }
    public void setFiled(boolean filled){
       this.filled = filled;
    }
}