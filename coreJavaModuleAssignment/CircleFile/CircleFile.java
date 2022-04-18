package com.company.CircleFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args)
    {
        ArrayList<CircleMethods> circleList=new ArrayList<>();
        fillCircleList(circleList);
        printCircleList(circleList);

    }

    public static void fillCircleList(ArrayList<CircleMethods> circleList)
    {
       Scanner infile;
       try{
           infile=new Scanner(new File("/home/goutM/IdeaProjects/java/src/circle_data.txt"));
           CircleMethods temp;
           double radius;
           while(infile.hasNext())
           {
               radius=infile.nextDouble();
               temp=new CircleMethods(radius);
               circleList.add(temp);
           }
           infile.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println("Cannot access file");
       }

    }
    public static void printCircleList(ArrayList<CircleMethods> circleList)
    {
        PrintWriter pw;
        try{
            pw=new PrintWriter("circles_output.txt");
            for(CircleMethods c:circleList) {
                System.out.println("Radius " +c.getRadius());
                System.out.println("Circumference "+c.circumferance());
                System.out.println("Area "+c.area());
                System.out.println();

                pw.println("Radius " +c.getRadius());
                pw.println("Circumference "+c.circumferance());
                pw.println("Area "+c.area());
                pw.println();
            }
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Couldn't access file");
        }
    }
}
