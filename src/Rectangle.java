import java.awt.*;
//Written by Jiatan Huang, huan2460
public class Rectangle {
    double posx;
    double posy;
    double width;
    double height;
    Color color;
    public Rectangle(double x, double y, double width,double height){
        this.posx = x;
        this.posy = y;
        this.width = width;
        this.height = height;
    }
    public double calculatePerimeter(){
        return 2*(this.width+this.height);
    }
    public double calculateArea(){
        return this.width * this.height;
    }
    public void setColor(Color colors){
        this.color = colors;
    }
    public void setPos(double x, double y){
        this.posx = x;
        this.posy = y;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public Color getColor(){
        return color;
    }
    public double getXPos(){
        return posx;
    }
    public double getYPos(){
        return posy;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
}
