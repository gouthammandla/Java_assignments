package com.company.Circle;

import java.util.Optional;

public class CircleDemo {
    public static void main(String[] args)
    {
      Circle unitCircle=new Circle();
      Circle myCircle=new Circle(5);
      Circle yourCircle=new Circle(12.75);
      PrintCircleData(unitCircle);
        PrintCircleData(myCircle);
        PrintCircleData(yourCircle);
    }
    public static void PrintCircleData(Circle circle)
    {
        System.out.println("Radius "+circle.getRadius());
        System.out.println("Circumferance "+circle.circumferance());
        System.out.println("Area "+circle.area());
        System.out.println();
    }
}
