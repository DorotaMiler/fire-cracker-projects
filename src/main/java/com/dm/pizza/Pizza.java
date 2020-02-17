package com.dm.pizza;

import java.util.Scanner;

import static com.dm.pizza.PizzaDiameter.SMALL;

public class Pizza {

    private PizzaPrice price;
    private PizzaDiameter diameter;
    private PizzaSize size;

    public Pizza() {
    }

    public Pizza(PizzaPrice price) {
        this.price = price;
    }

    public Pizza(PizzaDiameter diameter) {
        this.diameter = diameter;
    }

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    public Pizza(PizzaSize size, PizzaPrice price) {
        this.size = size;
        this.price = price;
    }

//    public PizzaSize getSize() {
//        return size = Math.PI * Math.pow(radius, 2);
//    }
//

    public double ratioBasedOnChoice(PizzaSize size) {
        // size to price
        if (size == PizzaSize.SMALL) {
            return pizzaRatio(PizzaSize.SMALL, PizzaPrice.SMALL);
        } else if (size == PizzaSize.MEDIUM) {
            return pizzaRatio(PizzaSize.MEDIUM, PizzaPrice.MEDIUM);
        } else (size == PizzaSize.BIG) {
            return pizzaRatio(PizzaSize.BIG, PizzaPrice.BIG);
        }
    }

    public double pizzaRatio(PizzaSize size, PizzaPrice price) {
        this.size = size;
        this.price = price;
        double ratio;
        return ratio = size.calculateSize() / price.getPrice();
    }

    public double pizzasComparison(PizzaSize pizzaSize) {
        PizzaSize chosenPizzaSize = pizzaSize.calculateSize();
    }

    {
        System.out.println("Hi! Welcome to DM's pizza!" + "\nWhat pizza size would you like to order?" + "\n\n(advise of pizza diameter of choice: small -> 25cm, medium -> 40cm or big -> 50cm)" + "\n.......");
        Scanner scan = new Scanner(System.in);
        double chosenSize = scan.nextDouble();
        System.out.println("Thank you. You have chosen: " + chosenSize + " size pizza." = "\nRatio calculation: ");


        Pizza pizza1 = new Pizza();

        Pizza pizza2 = new Pizza();


    }


    sizeThenPrice(PizzaSize pizzaSize) {
        PizzaDiameter diameter = new PizzaDiameter();
        if (pizzaSize == null) {
            System.out.println("Please choose pizza's size!");
        } else {
            switch (pizzaSize) {
                case SMALL:
                    pizza.getDiameter() = SMALL;
                    PizzaPrice price = new PizzaPrice();
                    price.getPrice() = SM
            }
        }

        public PizzaSize getSize () {
            return size;
        }

        public PizzaDiameter getDiameter () {
            return diameter;
        }

        public PizzaPrice getPrice () {
            return price;
        }
    }