package com.dm.pizza;

public class PizzaSize {

    PizzaSize(PizzaDiameter pizzaDiameter){
        int diameter = pizzaDiameter.getDiameter();
        double radius = (double)diameter/2;
        return size = Math.PI * Math.pow(radius, 2);
    }
}
