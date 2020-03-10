package com.thinkful.app.fraction;

public class Circle {
    private double centerX;
    private double centerY;
    private double radius;
    //declaring private variables

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1;
        // givng the variables value
    }

    public void translate(double dx, double dy) {
        this.centerX += dx;
        this.centerY += dy;
    }

    public double area() {
        return Math.PI * (this.radius * this.radius);
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public double getCenterX() {
        return centerX;
    }
    public double getCenterY() {
        return centerY;
    }
    public double getRadius() {
        return radius;
    }
    public double setCenterX(double centerX) {
        this.centerX = centerX;
    }
    public double setCenterY(double centerY) {
        this.centerY = centerY;
    }
    public double setRadius(double radius) {
        this.radius = radius;
    }

}