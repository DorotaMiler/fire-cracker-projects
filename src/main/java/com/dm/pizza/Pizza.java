package com.dm.pizza;

import java.util.Scanner;

public class Pizza {

    private PizzaPrice price;
    private PizzaDiameter diameter;
    private PizzaSize size;

    public Pizza(PizzaPrice price) {
        this.price = price;
    }

    public Pizza(PizzaDiameter diameter) {
        this.diameter = diameter;
    }

    public Pizza(PizzaSize size) {
        this.size = size;
    }

//    public PizzaSize getSize() {
//        return size = Math.PI * Math.pow(radius, 2);
//    }
//

    public void pizzaRatio(Pizza pizza) {
        size = pizza.getSize();
        price = pizza.getPrice();
        double ratio = size /(double)price;
        
        System.out.println("Pizza's price-size ratio equals: " + ratio);
    }

    public double pizzasComparison{
        System.out.println("Hi! Welcome to DM's pizza!" + "\nWhat pizza size would you like to order?" + "\n\n(advise of pizza diameter of choice: small -> 25cm, medium -> 40cm or big -> 50cm)" + "\n.......");
        Scanner scan = new Scanner(System.in);
        double chosenSize = scan.nextDouble();
        System.out.println("Thank you. You have chosen: "+chosenSize+" size pizza."="\nRatio calculation: ");


        Pizza pizza1 = new Pizza();

        Pizza pizza2 = new Pizza();

    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaDiameter getDiameter() {
        return diameter;
    }

    public PizzaPrice getPrice() {
        return price;
    }
}