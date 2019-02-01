package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        do {
//            System.out.println("Welcome Let's Play Roll the Dice");
//        } while (
        System.out.println("Welcome Let's Play Roll the Dice");
        // first select two number between 1-6 and display the numbers
          int min =1;
          int max =6;
          int num1;
          int num2;
          boolean a;
        boolean b;
        

       for (int c = 1; c <=100; c++){

        Random rand = new Random();
        num1= 1+rand.nextInt(6);
        System.out.print("You rolled "+ num1);
        num2= 1+rand.nextInt(6);
        System.out.print(" and " + num2+ "\n");

            /* show the score total */
              a = (num1==1);
              b = (num2==1);
              e = (num1 + num2);


//        System.out.println("Your score is: "+ (num1==1)+ (num2==1));//if false then do not print. else true sout your score is: n+ 25
//         while (num1==1)&&(num2==1){ num1+num2=25=c
//               System.out.println( c=25);}
           c += num1+num2-1;
        System.out.println("Your score is: " + c);

        ////request user to roll again or skip //create loop until score>=100
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Roll again? ");
            String yes = keyboard.next("yes");
        }}
            // else    (no)
            // if no then display "thank you for playing"
//            String no = keyboard.next("no");
//            System.out.println("Thank you for playing");

//            String response = keyboard.next();
//            while (!"yes".equalsIgnoreCase(response) && "no".equalsIgnoreCase(response))
//    {
//        System.out.println("roll again?");
//        yes = keyboard.next();
//    }
//            if ("no".equalsIgnoreCase(response)){
//        System.out.println();
    }
        //request user to roll again or skip
        //if num 1 then lost
        //if 1 and 1 is selected score is 25
        // score <=100 game over


