package com.thinkful.app.fraction;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = 0;
        this.y = 0;
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point p) {
        return Math.abs((p.getX() - this.x) - (p.getY() - this.y));
    }

    public double getX() {
        return x;
      }
    
      public void setX(double x) {
        this.x = x;
      }
    
      public double getY() {
        return y;
      }
    
      public void setY(double y) {
        this.y = y;
      }


}