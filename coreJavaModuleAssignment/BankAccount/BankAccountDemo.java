package com.company.BankAccount;

import javax.net.ssl.SSLContext;

public class BankAccountDemo {
    public static void main(String[] args)
    {
        BankAccount myAccount=new BankAccount("goutham",10000);
        BankAccount anilAccount=new BankAccount("anil",20000);
        anilAccount.deposit(400);
        System.out.println("owner "+anilAccount.getOwner() );
        System.out.println("balance "+anilAccount.getBalance() );

        anilAccount.withdraw(1000);
        System.out.println("owner "+anilAccount.getOwner() );
        System.out.println("balance "+anilAccount.getBalance() );

        System.out.println("owner "+myAccount.getOwner() );
        System.out.println("balance "+myAccount.getBalance() );

        myAccount.deposit(2000);
        System.out.println("owner "+myAccount.getOwner() );
        System.out.println("balance "+myAccount.getBalance() );
    }
}
