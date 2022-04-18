package com.company.Rectangle;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangleList=new ArrayList<>();
        FillArrayList(rectangleList);
        PrintRectangles(rectangleList);
    }
    public static void FillArrayList(ArrayList<Rectangle> rectangleArrayList)
    {
        Scanner infile;
        try{
            infile=new Scanner(new File("/home/goutM/IdeaProjects/java/src/rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;
            while(infile.hasNext())
            {
                length=infile.nextDouble();
                width=infile.nextDouble();
                temp=new Rectangle(length,width);
                rectangleArrayList.add(temp);
            }
            infile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot access file");
        }
    }
    public static void PrintRectangles(ArrayList<Rectangle> rectangleArrayList)
    {
        for(Rectangle r:rectangleArrayList)
        {
            System.out.println("length " +r.getLength());
            System.out.println("Width "+r.getWidth());
            System.out.println("Area "+r.area());
            System.out.println("Perimeter "+r.perimeter());
            System.out.println();
        }
    }
}

