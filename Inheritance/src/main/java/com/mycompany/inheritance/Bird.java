/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author admin
 */
public class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name,age);
        this.wingspan = wingspan;
    }
    
    public double getWingspan() {
        return wingspan;
    }
    
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
        
    }
    
    @Override
    public String move() {
        return" likes to fly and chirp ";
    }
    
    @Override
    public String speak() {
        return " chirp";
        
    }
    
    public String describe() {
        return "Bird-" + super.basicInfo() + "" + move();
    }
}
