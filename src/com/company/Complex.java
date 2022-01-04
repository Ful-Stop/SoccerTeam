package com.company;

public class Complex {
    private double a;
    private double b;

    public Complex(double x, double y){
        a = x;
        b = y;
    }

    public Complex(double x){
        this(x, 0.0);
    }

    public double abs(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Complex add(Complex other){
        return new Complex((a + other.a), (b + other.b));
    }

    public String toString(){
        return a + " + " + b + " * i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1);
        Complex c2 = new Complex(1, 4);
        Complex c3 = new Complex(2, 3);
        Complex c4 = new Complex(5, 6);
        Complex c5 = new Complex(0, 4);
        Complex c6 = new Complex(0, 0);
    }

}
