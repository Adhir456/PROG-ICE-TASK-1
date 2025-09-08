/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;
import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */
public class Inheritance {
    
   

    public static void main(String[] args) {
   var zoo = new ArrayList<Animal>();
   zoo.add(new Animal("Skye",3));
   zoo.add(new Dog("Fluffy",2,true));
   zoo.add(new Cat("Rex",5));

  
   
   for (Animal a : zoo){
       System.out.println(a.getName() + " " + a.move() + " " + a.speak());
       
   }
   
   Bird myBird = new Bird ("Sky",1,0.5);
   System.out.println("Before ageUp:" + myBird.getAge());
   
   
   Cat myCat = new Cat ("Kitty",2);
   
   System.out.println(myCat.describe());
   System.out.println(myBird.describe());
   
   
    }
    
    
}
