package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ourGuess;
        int comNumber;
        int guessCount=0;
        Random random=new Random();
        comNumber=random.nextInt(100)+1;
        boolean guessedNum=false;

        while(!guessedNum)
        {
            System.out.println("Enter your integer guess");
            ourGuess=sc.nextInt();
            guessCount++;
            if(ourGuess>=1 && ourGuess<=100)
            {
                if(ourGuess==comNumber)
                {
                      System.out.println("Congratulations!..You guessed the number in "+guessCount+" guesses!, Thanks for playing");
                      guessedNum=true;
                }
                else if(ourGuess>comNumber)
                {
                    System.out.println("Your guess was too high!");

                }
                else if(ourGuess<comNumber)
                {
                    System.out.println("Your guess was too low!");
                }
            }
            else
            {
                System.out.println("That was wasted guess, pick a number from 1 to 1000");
            }
        }


    }
}
