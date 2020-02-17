package com.dm.pizza;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * An application calculating profitability of pizza.
 * it calculates a ratio of pizza'circle's area to pizza's price
 * which one is more profitable:
 * 40 cm for 25 zl
 * 50 cm for 33 zl
 * or
 * 30 cm for 20 zl
**/


public class PizzaApp {
    public static void main(String[] args) {

        System.out.println("Hallo! Which pizza size would you like to order: "+"\n small,"+"\n medium,"+" or big?");
        Scanner scan = new Scanner(System.in);
        PizzaSize chosenPizzaSize = PizzaSize.valueOf(scan.nextLine().toUpperCase());
        if (chosenPizzaSize == null){
            System.out.println("No pizza's size chosen."+"\nPlease choose again from above mentioned available sizes.");
        } else {
            switch(chosenPizzaSize){
                case SMALL:
                    PizzaSize pizzaSize = PizzaSize.SMALL;
                    break;
                case "medium":



            }

        }

    }
}

