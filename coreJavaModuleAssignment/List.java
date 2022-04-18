package com.company;

import java.util.*;
import java.util.ArrayList;

public class List {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        ArrayList<Double> arrayList=new ArrayList<>();
        double input;
        System.out.println("Enter o or more to put in the list or -1 to exit");
        input=sc.nextDouble();
        while(input>=0)
        {
            arrayList.add(input);
            System.out.println("Enter o or more to put in the list or -1 to exit");
            input=sc.nextDouble();
        }
        for(int i=arrayList.size()-1;i>=0;i--)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
