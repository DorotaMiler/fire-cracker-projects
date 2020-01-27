package com.dm.pizza;

public class Pizza {

    final double SMALL_PRICE = 17;
    final double MEDIUM_SIZE = 25;
    final double BIG_SIZE = 33;

    final double SMALL_SIZE = 25;
    final double MEDIUM_SIZE = 40;
    final double BIG_SIZE = 50;
    double radius;
    double diameter;

    public Pizza(double price, double size) {
        pizzaRatio(price, size);
    }

    public static smallPizza

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