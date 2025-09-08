/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author admin
 */
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name,age);
    }
    @Override
    public String speak(){
        return "meow";
    }
    
    @Override
    public String move(){
        return" likes to prowl and";
    }
    
    public String describe() {
        return "Cat-" + super.basicInfo() + "" + move();
    }
    
}
