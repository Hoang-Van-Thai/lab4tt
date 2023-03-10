/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author ADMIN
 */
public class Shape {
    private String color;
    private boolean filler;

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }
    @Override
    public String toString(){
        return "color"+color+"filler"+filler;
    }
    
}
