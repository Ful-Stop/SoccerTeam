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
        return new Complex(a + other.a, b + other.b);
    }

    public Complex add(double x){
        return new Complex(a + x, b);
    }

    public String toString(){
        return a + " + " + b + " * i";
    }

    public Complex multiply(Complex other){
        return new Complex(a * other.a - b * other.b, a * other.b + b * other.a);
    }

    public Complex multiply(double x){
        return new Complex(a * x, b * x);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1, 4);
        Complex c2 = new Complex(2, 3);
        double d = 4;

        System.out.println(c1.abs());
        System.out.println(c2.abs());

        System.out.println(c1.add(c2));
        System.out.println(c1.add(d));

        System.out.println(c1.multiply(c2));
        System.out.println(c1.multiply(d));

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
