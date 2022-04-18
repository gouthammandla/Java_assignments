package com.company;

import java.util.ArrayList;

public class SumOfElements {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        int sum=addElements(arrayList);
        System.out.println(sum);
    }
    public static int addElements(ArrayList<Integer> array)
    {
        int sum=0;
        for(int i=0;i< array.size();i++)
        {
            sum=sum+array.get(i);
        }
        return sum;
    }
}
