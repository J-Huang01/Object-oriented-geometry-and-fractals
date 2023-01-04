// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
//Written by Jiatan Huang, huan2460
public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas();
        Color color=Color.BLUE;

        if(type.equals("circle")){//type is a string not busic so use .equal
            Circle myCircle = new Circle(400,400,100);// Creates a new Circle object
            drawCircleFractal(100,400,400,color,drawing,7);
            totalArea = myCircle.calculateArea();
        }else if(type.equals("rectangle")){
            Rectangle myRectangle = new Rectangle(400,400,100,100);// Creates a new Circle object
            drawRectangleFractal(100,100,400,400,color,drawing,7);
            totalArea = myRectangle.calculateArea();
        }else if(type.equals("triangle")){
            Triangle myTriangle = new Triangle(100,100,100,50*Math.sqrt(3));
            drawTriangleFractal(100,50*Math.sqrt(3),400,400,color,drawing,7);
            totalArea = myTriangle.calculateArea();
        }
        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        double shrink = 0.5;
        double wid=width;
        double hei = height;
        Triangle myTriangle=new Triangle(x,y,wid,hei);

        int lev = level;




        if(level<=0){
            return;
        }
        else{
            double newWid = wid*shrink;
            double newHei = hei*shrink;

            Random rand = new Random();
            Color color = new Color(rand.nextInt(0xFFFFFF));
            myTriangle.setColor(color);
            can.drawShape(myTriangle);

            drawTriangleFractal(newWid,newHei,x-newWid,y,color,can,lev-1);
            drawTriangleFractal(newWid,newHei,x+0.5*newWid,y-newHei*2,color,can,lev-1);
            drawTriangleFractal(newWid,newHei,x+newWid*2,y,color,can,lev-1);

            // color
            // position
            // draw

        }
    //if red then blue
      //          if blue then gree
        //        if green then red
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        double shrink = 0.5;
        double rad = radius;
        Circle myCircle=new Circle(x,y,rad);

        int lev=level;




        if(level<=0){return;
        }
        else {
            double newRad = rad*shrink;

            Random rand = new Random();
            Color color = new Color(rand.nextInt(0xFFFFFF));
            myCircle.setColor(color);
            can.drawShape(myCircle);

            drawCircleFractal(newRad,x-3*newRad,y,color,can,lev-1);
            drawCircleFractal(newRad,x,y+3*newRad,color,can,lev-1);
            drawCircleFractal(newRad,x+3*newRad,y,color,can,lev-1);
            drawCircleFractal(newRad,x,y-3*newRad,color,can,lev-1);



        }


    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        double shrink = 0.5;
        double wid =width;
        double hei = height;
        Rectangle myRectangle=new Rectangle(x,y,wid,hei);

        int lev=level;

        //Recursion
        if(level<=0){return;
        }
        else {
            double newWid = wid*shrink;
            double newHei = hei*shrink;

            Random rand = new Random();
            Color color = new Color(rand.nextInt(0xFFFFFF));
            myRectangle.setColor(color);
            can.drawShape(myRectangle);

//            Rectangle bottomLeft=new Rectangle(x-newWid,y,newWid,newHei);
//            Rectangle topLeft=new Rectangle(x-newWid,y+newHei*2,newWid,newHei);
//            Rectangle bottomRight=new Rectangle(x+newWid*2,y,newWid,newHei );
//            Rectangle topRight=new Rectangle(x+newWid*2,y+newHei*2,newWid,newHei);
//
//            can.drawShape(bottomLeft);
//            can.drawShape(topLeft);
//            can.drawShape(bottomRight);
//            can.drawShape(topRight);

            drawRectangleFractal(newWid,newHei,x-newWid,y-newHei,color, can, lev-1);//bottomLeft
            drawRectangleFractal(newWid,newHei,x-newWid,y+newHei*2,color, can, lev-1);//topLeft
            drawRectangleFractal(newWid,newHei,x+newWid*2,y-newHei,color, can, lev-1);//bottomRight
            drawRectangleFractal(newWid,newHei,x+newWid*2,y+newHei*2,color, can, lev-1);//topRight


        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
//        Canvas can = new Canvas();
        Random rand = new Random();
        Color color = new Color(rand.nextInt(0xFFFFFF));
        //drawing.drawShape(MyCircle);
        System.out.println("What is your input? (choice:'circle','triangle' or 'rectangle')");
        Scanner myScanner = new Scanner(System.in);

        String input = myScanner.nextLine();
        System.out.println(input);
        FractalDrawer fd = new FractalDrawer();//no assign; need to first assign an object
        System.out.println(fd.drawFractal(input));

}

}
