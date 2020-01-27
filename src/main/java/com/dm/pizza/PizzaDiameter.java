package com.dm.pizza;

public enum PizzaDiameter {
    SMALL(25),
    MEDIUM(40),
    BIG(50);

    int diameter;

    PizzaDiameter(int i) {
    }


    public int PizzaDiameter(int diameter) {
        return diameter;
    }
}
