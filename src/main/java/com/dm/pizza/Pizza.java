package com.dm.pizza;

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
        double ratio = (double) size /price;

        
        System.out.println("Pizza's price-size ratio equals: " + ratio);
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