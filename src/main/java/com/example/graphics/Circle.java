package com.example.graphics;

public class Circle extends Shape{
    double radius;
    public Circle(double xPos, double yPos,double radius) {
        super(xPos, yPos);
        this.radius = radius;
    }


    @Override
    public double computeArea() {
        double Area = Math.PI*this.radius*this.radius;
        return Area;
    }
    @Override
    public double computeCirconference(){
        double Circonference=2*Math.PI*this.radius*this.radius;
        return Circonference;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +'}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
