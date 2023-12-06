/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author YusufOpens
 */
public class Class {
   //NİTELİKLER
   String type;
   String model;
   String color;
   int speed;
   int speedLimit=180;
    
   void increaseSpeed(int increase){
  if(speed+increase<speedLimit){
       speed+=increase;
          }
  
   }
   void decreaseSpeed(int decrease){
   speed-=decrease;
   
   
   }
   void print(){
       System.out.println("Hızınız ====>>> "+speed);
   
   
   }
   
}
