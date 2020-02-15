package com.dm.pizza;

public class PizzaSize {

    private double size;

    public double PizzaSize(PizzaDiameter pizzaDiameter){
        int diameter = pizzaDiameter.getDiameter();
        double radius = (double)diameter/2;
        return size = Math.PI * Math.pow(radius, 2);
    }
    
    public void printSize(){
        System.out.println(PizzaSize(PizzaDiameter pizzaDiameter));
    }

    public double getSize() {
        return size;
    }
}
