/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YusufOpens
 */
 class car {  //NİTELİKLER
   String type;
   String model="TEST";
   String color;
   int speed=23;
   int speedLimit=180;
    
   car(String model,int speed,String color){
      this.model=model;
      this.color= color;
      this.speed=speed;
      this.type="Sport";
       System.out.println("Parametreli kurucu metodu oluştu!!");
   
   }
   car(){System.out.println("Boş kurucu metodu oluştu!!");
   }
   
   void increaseSpeed(int increase){
  if(this.speed+increase<speedLimit){
       this.speed+=increase;
          }
  
   }
   void decreaseSpeed(int decrease){
   this.speed-=decrease;
   
   
   }
   void print(){
       System.out.println(this.model+ "Hızınız ====>>> "+this.speed+" RENGİNİZ "+this.color);
   
   
   }
       
   void printSpeed(){
       System.out.println("Model\t:" + this.model);
       System.out.println("Speed\t:"+this.speed);
       System.out.println("Color\t:"+this.color);
       System.out.println("Type\t:"+this.type);  
   
   }
}
