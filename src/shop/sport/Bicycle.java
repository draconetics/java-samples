package shop.sport;

/**
 * Parent class of specific bike items.
 * @author dracon
 * @version 1.0
 * @since 2018-12-21
 */
class Bicycle {
    private int gear; 
    private int speed; 
          
    public Bicycle(int gear, int speed) { 
        this.gear = gear; 
        this.speed = speed; 
    } 

    public void applyBrake(int decrement) { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) { 
        speed += increment; 
    } 

 
/** 
 * toString() method to print info of Bicycle
 * @return String Detail of bicycle.
 */
    public String toString() { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 