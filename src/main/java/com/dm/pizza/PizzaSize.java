package com.dm.pizza;

public class PizzaSize {

    private double size;

    public double pizzaSize(PizzaDiameter pizzaDiameter){
        int diameter = pizzaDiameter.getDiameter();
        double radius = (double)diameter/2;
        return size = Math.PI * Math.pow(radius, 2);
    }

    public void printSize(int diameter){
        System.out.println("Pizza's size is: "+pizzaSize(diameter);
    }

    public double getSize() {
        return size;
    }
}
