package com.company.IceCream;

public class IceCreamDemo {
    public static void main(String[] args)
    {
        IceCream myIC=new IceCream("Chocolate",3,2);
        IceCream yourIC=new IceCream("Strawberry",2,1);

        myIC.addTopping("nuts");
        myIC.addTopping("cherries");
        yourIC.addTopping("springles");
        printIceCream(myIC);
        printIceCream(yourIC);
    }
    public static void printIceCream(IceCream iceCream)
    {
        System.out.println(iceCream.getName());
        System.out.println("cost "+iceCream.getCost());
        System.out.println("Topped with:");
        iceCream.printTopping();
    }
}
