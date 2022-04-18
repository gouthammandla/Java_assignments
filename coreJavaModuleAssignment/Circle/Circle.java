package com.company.Circle;

public class Circle {
    private double radius;
    public Circle(){
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double circumferance()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
}
