package com.dm.pizza;

public class enum PizzaDiameter {
    SMALL(25),
    MEDIUM(40),
    BIG(50);

    int diameter;


    private PizzaDiameter(int getDiameter){
        diameter = getDiameter
    }
}
