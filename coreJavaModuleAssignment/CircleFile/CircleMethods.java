package com.company.CircleFile;

public class CircleMethods {
    private double radius;
    public CircleMethods(){
    }
    public CircleMethods(double radius)
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
