package com.dm.pizza;

public enum PizzaDiameter {

    //enum fields
    SMALL(20),
    MEDIUM(40),
    BIG(50);

    private int diameter;
    private double radius;

    public int getDiameter() {
        return diameter;
    }

    private PizzaDiameter(final int diameter) {
        this.diameter = diameter;
    }

//    public PizzaDiameter smallPizza(final int diameter) {
//        if (diameter = 20) {
//            return PizzaDiameter.SMALL;
//        }
//    }


}
