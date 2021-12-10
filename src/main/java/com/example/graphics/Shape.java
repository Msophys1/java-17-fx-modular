package com.example.graphics;

public abstract class Shape {
    protected double xPos;
    protected double yPos;


    public Shape(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

    }

    public abstract double computeArea();

    public abstract double computeCirconference();

    @Override
    public String toString() {
        return "Shape{" + "xPos=" + xPos + ", yPos=" + yPos + '}';
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }
}
