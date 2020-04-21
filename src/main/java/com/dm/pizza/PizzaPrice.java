package com.dm.pizza;

public enum PizzaPrice {
    SMALL(20),
    MEDIUM(25),
    BIG(33);

    private int price;

    PizzaPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    //    public double getSMALL_PRICE() {
    //        return SMALL_PRICE;
    //    }
    //
    //    public double getMEDIUM_PRICE() {
    //        return MEDIUM_PRICE;
    //    }
    //
    //    public double getBIG_PRICE() {
    //        return BIG_PRICE;
    //    }
}