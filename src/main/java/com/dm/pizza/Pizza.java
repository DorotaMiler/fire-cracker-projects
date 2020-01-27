package com.dm.pizza;

public class Pizza {

    private PizzaPrice price;
    private PizzaDiameter diameter;
    private PizzaSize size;
    double radius;

    public Pizza(PizzaPrice price, PizzaDiameter diameter) {
        this.price = price;
        this.diameter = diameter;
    }

    smallPizza(double size)

    public double getPizzaSize(double radius) {
        return size = Math.PI * Math.pow(radius, 2);
    }

    public void pizzaRatio(double price, double size) {
        System.out.println("Pizza's price-size ratio equals: " + getPrice() / size;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }

    public double getRadius() {
        return radius;
    }
}