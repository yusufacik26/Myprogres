/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YusufOpens
 */
public class cars {
    public static void main(String[] args) {

        car audi = new car("Audi",10,"mor");
       audi.printSpeed();
       /* audi.speed=31;
        audi.increaseSpeed(20);
        
        audi.model="A5";
        
        audi.type="Sport";
      
        audi.color="black";
  
        audi.speedLimit=180;
       audi.print();
        audi.printSpeed();
               
        */
        car bmw = new car();
       bmw.model="BMW";
       bmw.speed=12;
       bmw.increaseSpeed(123);
        bmw.decreaseSpeed(23);
        bmw.color="GRİ";
       
   
        car mercedes = new car();
    
    
}
    }
