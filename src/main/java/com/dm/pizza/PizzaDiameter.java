package com.dm.pizza;

public enum PizzaDiameter {
    SMALL(20),
    MEDIUM(40),
    BIG(50);

    int diameter;

    private PizzaDiameter getSmall (int diameter) {
        diameter = 25;
    }


    public int PizzaDiameter(int diameter) {
        return diameter;
    }
}
