package shop.sport;

/**
 * Specifications of Mountain Bike item. 
 * @author dracon
 * @version 1.0
 * @since 2018-12-21
 */

class MountainBike extends Bicycle { 
   

 public int seatHeight; 


 public MountainBike(int gear,int speed, 
                     int startHeight) 
 { 
     super(gear, speed); 
     seatHeight = startHeight; 
 }  
       

 public void setHeight(int newValue) 
 { 
     seatHeight = newValue; 
 }  
   
 /** 
  * toString() method to print info of Mountain Bike.
  * @return String Detail of bicycle.
  */ 
 @Override
 public String toString() 
 { 
     return (super.toString()+ 
             "\nseat height is "+seatHeight); 
 } 
   
} 