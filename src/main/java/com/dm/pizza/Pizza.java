package com.dm.pizza;

public class Pizza {

     double smallPizzaPrice = 15;
     double mediumPizzaPrice = 35;
     double bigPizzaPrice = 50;
     double diameter;
     double radius = diameter / 2;
     double size = Math.PI * Math.pow(radius, 2);


    public Pizza(double price, double size){
        pizzaRatio(price,size);
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