import java.awt.*;
//Written by Jiatan Huang, huan2460
public class Circle {
    double posx;
    double posy;
    double rad;
    Color color;
    public Circle(double x, double y, double radius){
        this.posx=x;
        this.posy=y;
        this.rad= radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*this.rad;
    }
    public double calculateArea(){
        return Math.PI*Math.pow(this.rad,2);
    }
    public void setColor(Color colors){
        this.color=colors;
    }
    public void setPos(double x , double y){
        this.posx=x;
        this.posy=y;

    }
    public void setRadius(double rad) {
        this.rad = rad;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return posx;
    }

    public double getYPos() {
        return posy;
    }

    public double getRadius() {
        return rad;
    }
}
