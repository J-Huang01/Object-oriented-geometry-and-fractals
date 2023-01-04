import java.awt.*;
//Written by Jiatan Huang, huan2460
public class Triangle {
    double posx;
    double posy;
    double width;
    double height;
    Color color;
    public Triangle(double x, double y, double width, double height){
        this.posx=x;
        this.posy=y;
        this.width=width;
        this.height = height;
    }
    public double calculatePerimeter(){
        return 2 * Math.sqrt(Math.pow(this.height,2) + Math.pow(this.width/2,2)) + this.width;
    }
    public double calculateArea(){
        return 0.5*this.width*this.height;
    }
    public void setColor(Color colors){
        this.color=colors;
    }
    public void setPos(double x , double y){
        this.posx=x;
        this.posy=y;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
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



}
