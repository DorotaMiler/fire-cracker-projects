package com.dm.pizza;

public enum PizzaDiameter {

    SMALL(30),
    MEDIUM(40),
    BIG(50);

    private int diameter;

    public PizzaDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
//   public PizzaDiameter smallPizza(final int diameter) {
//        if (diameter = 20) {
//            return PizzaDiameter.SMALL;
//        }
//    }
}