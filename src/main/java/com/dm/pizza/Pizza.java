package com.dm.pizza;

public class Pizza {

    private PizzaPrice price;
    private PizzaDiameter diameter;
    private PizzaSize size;

    public Pizza(PizzaPrice price, PizzaDiameter diameter) {
        this.price = price;
        this.diameter = diameter;
    }

    smallPizza(double size)

//    public PizzaSize getSize() {
//        return size = Math.PI * Math.pow(radius, 2);
//    }
//
//    public double ge (double radius) {
//        return size;
//    }

    public void pizzaRatio(double price, double size) {
        System.out.println("Pizza's price-size ratio equals: " + getPrice() / size;
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

    public double getRadius() {
        return radius= diameter/2;
    }
}