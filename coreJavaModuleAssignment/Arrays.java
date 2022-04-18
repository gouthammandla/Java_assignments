package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int[] values=new int[5];
        for(int i=0;i<values.length;i++)
        {
            System.out.println("Enter the number");
            values[i]=sc.nextInt();
        }
        for(int i=0;i<values.length;i++)
        {
            int result=values[i]*2;
            System.out.println("result is "+result);
        }

    }
}
