package com.example.monthly_planner.helper;
import java.util.*;
public class e_and_t {
	
   //private variables
   Date _date;
   Double _cost;
   
   // Empty constructor
   public e_and_t(){
        
   }
   // constructor
   public e_and_t(Date date, Double cost ){
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







