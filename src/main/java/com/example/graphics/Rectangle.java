package com.example.graphics;

public class Rectangle extends Shape{
    double With;
    double Height;

    public Rectangle(double xPos, double yPos) {
        super(xPos, yPos);
        this.Height = yPos;
        this.With = xPos;
    }


    public double computeArea(){
        return xPos*yPos;
    }
    public double computeCirconference(){
        return (2*With)+(2*Height);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "With=" + With + ", Height=" + Height + '}';
    }

    public double getWith() {
        return With;
    }

    public void setWith(double with) {
        With = with;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
}
