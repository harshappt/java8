/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author harsha
 */
public class InternalVsExternalIterator {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
        //find and print square of each number in the list
        
        //imperetive style
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)*list.get(i));
        }
        
        for(Integer i : list){
            System.out.println(i*i);
        }
        
        //Functional style
        
        list.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println(t*t);
            }
        });
        
        list.forEach((Integer t) -> {System.out.println(t*t);});
        list.forEach(t->System.out.print(t*t));
     
        
        
        
        
//        List<Weather> weatherObjs = new ArrayList<>();
//        
//        for(Integer zipCode : Locations.locations){
//           weatherObjs.add(WeatherUtil.findWeatherByZipCode(zipCode));
//        }
//        
//       
//        for(Weather obj : weatherObjs){
//            if(obj.getTemp() < 60){
//                System.out.println("City  "+obj.getCity()+"  Temp "+obj.getTemp());
//            }
//        }
        
        
      
    } 
    
}
