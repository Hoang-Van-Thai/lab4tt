/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author ADMIN
 */
public class Rectangle extends Shape{
    private double width=1;
    private double length=1;

    public Rectangle(String color, boolean filler) {
        super(color, filler);
    }

    public Rectangle() {
    }
    public Rectangle(double width,double length,String color, boolean filler) {
        super(color, filler);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth1(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength1(double length) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return " S="+getArea()+"CV="+getPerimeter();
    }
    
    
}
