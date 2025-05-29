package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        if(radius < 0){
            radius = 0;
        }
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }


}
