package com.dm.pizza;

public enum PizzaSize {

    SMALL {
        public double calculateSize() {
            int diameter = PizzaDiameter.SMALL.getDiameter();
            double radius = (double) diameter / 2;
            double size;
            return size = Math.PI * Math.pow(radius, 2);
        }
    },
    MEDIUM {
        public double calculateSize() {
            int diameter = PizzaDiameter.MEDIUM.getDiameter();
            double radius = (double) diameter / 2;
            double size;
            return size = Math.PI * Math.pow(radius, 2);
        }
    },
    BIG {
        public double calculateSize() {
            int diameter = PizzaDiameter.BIG.getDiameter();
            double radius = (double) diameter / 2;
            double size;
            return size = Math.PI * Math.pow(radius, 2);
        }
    };

    public abstract double calculateSize();

    public double ratioBasedOnChoice(PizzaSize size) {
        // size to price
        if (size == PizzaSize.SMALL) {
            return pizzaRatio(PizzaSize.SMALL, PizzaPrice.SMALL);
        } else if (size == PizzaSize.MEDIUM) {
            return pizzaRatio(PizzaSize.MEDIUM, PizzaPrice.MEDIUM);
        } else (size == PizzaSize.BIG) {
            return pizzaRatio(PizzaSize.BIG, PizzaPrice.BIG);
        }
    }

    public double pizzaRatio(PizzaSize size, PizzaPrice price) {
        double ratio;
        return ratio = size.calculateSize() / price.getPrice();
    }

}