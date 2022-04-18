package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class parallel {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        ArrayList<String > names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a name\t");
            name=sc.nextLine();
            System.out.println("Enter age\t");
            age=sc.nextInt();

            sc.nextLine();
            names.add(name);
            ages.add(age);
        }
        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
        }
    }
}
