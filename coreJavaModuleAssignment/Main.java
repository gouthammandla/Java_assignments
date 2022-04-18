package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String adj1;
        String girlsName;
        String adj2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adj3;
        String occupation2;
        String boysName;
        String mansName;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an adjective\t");
        adj1=sc.nextLine();
        System.out.println("Enter girls name\t");
        girlsName=sc.nextLine();
        System.out.println("Enter another adjective\t");
        adj2=sc.nextLine();
        System.out.println("Enter an occupation\t");
        occupation1=sc.nextLine();
        System.out.println("Enter a place name\t");
        placeName=sc.nextLine();
        System.out.println("Enter the name of piece of cloth\t");
        clothing=sc.nextLine();
        System.out.println("Enter name of the hobby\t");
        hobby=sc.nextLine();
        System.out.println("Enter another adjective\t");
        adj3=sc.nextLine();
        System.out.println("Enter another occupation\t");
        occupation2=sc.nextLine();
        System.out.println("Enter a boys name\t");
        boysName=sc.nextLine();
        System.out.println("Enter a mans name");
        mansName=sc.nextLine();

        System.out.println("There once was a "+adj1+" girl named "+girlsName+" who was a "+adj2+" "+occupation1+" in the kingdom of " +placeName+".");
        System.out.println("she loved to wear "+clothing+" and to "+hobby+" she wanted to mary "+adj3+" "+occupation2+" named"+boysName+"" +
                " but her father, king"+mansName+" forbid her seeing him.");
    }
}

