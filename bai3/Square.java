/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author ADMIN
 */
public class Square extends Rectangle {
    private double side;


    public Square() {
    }
    public Square(double side) {
        this.side=side;
    }

     public Square(double side,String color, boolean filler) {
        super(color, filler);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.setWidth1(side);
    }

    public void setLength(double side) {
        this.setLength1(side);
    }
     @Override
    public String toString(){
        return " S="+getArea()+"CV="+getPerimeter();
    }
    
}
