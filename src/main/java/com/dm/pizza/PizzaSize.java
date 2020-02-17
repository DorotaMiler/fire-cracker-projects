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
}