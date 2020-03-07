package com.thinkful.app.rectangle;

public class Rectangle {
    //write a class named rectangle with 2 constructors
    private int x;
    private int y;
    private int height;
    private int width;
    //declaring variable

    public Rectangle(int x, int y, int height, int width) {
        //constructor that accepts 4 values and sets the appropriately
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        //no argument constructor that sets the variables to have certain instances
        this.x = 0;
        this.y = 0;
        this.height = 4;
        this.width = 2;
    }

    public int getX() {
        return x;
      }
      //gets value of x 
    
      public void setX(int x) {
        this.x = x;
      }
      //sets value of x
    
      public int getY() {
        return y;
      }
    
      public void setY(int y) {
        this.y = y;
      }
    
      public int getHeight() {
        return height;
      }
    
      public void setHeight(int height) {
        this.height = height;
      }
    
      public int getWidth() {
        return width;
      }
    
      public void setWidth(int width) {
        this.width = width;
      }
}