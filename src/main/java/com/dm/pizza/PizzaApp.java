package com.dm.pizza;


import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {

        /*

        napisz program, który policzy “opłacalność” pizzy:
        - wylicz stosunek pola pizzy do jej ceny

        Czy bardziej opłaca się kupić pizzę 40 cm za 25 zł, czy 50 cm za 33 zł?
        A może pizzę 30 cm za 20 zł?

        */
    }

    public double pizzasComparison{
        System.out.println("Hi! Welcome to DM's pizza!" + "\nWhat pizza size would you like to order?" + "\n\n(advise of pizza diameter of choice: small -> 25cm, medium -> 40cm or big -> 50cm)" + "\n.......");
        Scanner scan = new Scanner(System.in);
        double chosenSize = scan.nextDouble();
        System.out.println("Thank you. You have chosen: "+chosenSize+" size pizza."="\nRatio calculation: ");


        Pizza pizza1 = new Pizza();

        Pizza pizza2 = new Pizza();

    }
}

