package com.dm.pizza;

public class Pizza {

    private double price;
    private double diameter;
    private double radius = diameter / 2;
    private double size = Math.PI * Math.pow(radius, 2);

    public void pizzaRatio(double price, double size) {
        System.out.println("Pizza's price-size ratio equals: " + getPrice() / getSize());
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

    public double getSize() {
        return size;
    }
}