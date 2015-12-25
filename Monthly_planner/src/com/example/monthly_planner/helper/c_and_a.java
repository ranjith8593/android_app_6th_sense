
package com.example.monthly_planner.helper;
import java.util.*;
public class c_and_a {
	
   //private variables
   Date _date;
   Double _cost;
   
   // Empty constructor
   public c_and_a(){
        
   }
   // constructor
   public c_and_a(Date date, Double cost ){
       this._date = date;
       this._cost = cost;
       
   }
    
   
   // getting date
   public Date getDate(){
       return this._date;
   }
    
   // setting date
   public void setDate(Date date){
       this._date = date;
   }
    
   // getting cost
   public Double getCost(){
       return this._cost;
   }
    
   // setting cost
   public void setCost(Double cost){
       this._cost = cost;
   }
    
  
}


