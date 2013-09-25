/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harsha
 */
public class InternalVsExternalIterator {
    
    public static void main(String[] args) {
        
    
        List<Weather> weatherObjs = new ArrayList<>();
        
        for(Integer zipCode : Locations.locations){
           weatherObjs.add(WeatherUtil.findWeatherByZipCode(zipCode));
        }
        
       
        for(Weather obj : weatherObjs){
            if(obj.getTemp() < 60){
                System.out.println("City  "+obj.getCity()+"  Temp "+obj.getTemp());
            }
        }
        
        
      
    } 
    
}
