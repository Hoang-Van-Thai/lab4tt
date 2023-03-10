/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author ADMIN
 */
public class Circle extends Shape {
    private double radius=1;
    final double PI=3.14;

    public Circle(String color, boolean filler) {
        super(color, filler);
    }

    public Circle() {
    }
    public Circle(double radius,String color, boolean filler) {
        super(color, filler);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*PI;
    }
    public double getPerimeter() {
        return radius*2*PI;
    }
    @Override
    public String toString(){
        return " S="+getArea()+"CV="+getPerimeter();
    }
    
}
