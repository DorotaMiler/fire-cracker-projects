package com.dm.pizza;

public class Pizza {

    final double smallPizzaPrice = 15;
    final double mediumPizzaPrice = 35;
    final double bigPizzaPrice = 50;
    private double radius;
    double size;
    double diameter;


    public Pizza(double price, double size) {
        pizzaRatio(price, size);
    }

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