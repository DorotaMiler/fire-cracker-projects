package com.dm.pizza;

public class Pizza {

    private PizzaPrice price;
    private PizzaDiameter diameter;
    private PizzaSize size;

    public Pizza(PizzaPrice price, PizzaDiameter diameter) {
        this.price = price;
        this.diameter = diameter;
    }


//    public PizzaSize getSize() {
//        return size = Math.PI * Math.pow(radius, 2);
//    }
//

    public void pizzaRatio(Pizza pizza) {
        int size = pizza.getSize();
        double price = pizza.getPrice();
        double ratio = size/price;
        System.out.println("Pizza's price-size ratio equals: "
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