package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class NamePermutations {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<String > firstNames=new ArrayList<>();
        ArrayList<String> lastNames=new ArrayList<>();
        String fullName;
        String firstName;
        String lastName;
        int index;
        final int NUM_NAMES=5;
        for(int i=0;i<NUM_NAMES;i++)
        {
            System.out.println("Enter fullname "+i);
            fullName=sc.nextLine();
            index=fullName.indexOf(" ");
            firstName=fullName.substring(0,index);
            lastName=fullName.substring(index+1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i=0;i<firstNames.size();i++)
        {
            for(int j=0;j<lastNames.size();j++)
            {
                System.out.print(firstNames.get(i)+" ");
                System.out.println(lastNames.get(j));
            }
        }
    }
}
