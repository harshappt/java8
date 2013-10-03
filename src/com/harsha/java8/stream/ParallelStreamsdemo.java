/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsha.java8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harsha
 */
public class ParallelStreamsdemo {

    public static void main(String[] args) {
        List<Weather> weatherObjs = new ArrayList<>();
	List<Weather> weatherObjsBelow70 = new ArrayList<>();
        long start = System.nanoTime();
        for (int zipCode : Locations.locations) {
            Weather weatherObj =  WeatherUtil.findWeatherByZipCode(zipCode);
            System.out.println(weatherObj.getCity()+" "+weatherObj.getTemp());
            weatherObjs.add(weatherObj);
            if(weatherObj.getTemp() < 70){
                weatherObjsBelow70.add(weatherObj);
            }
         }

        Weather highiestBelow70 = new Weather();
        for(Weather weather : weatherObjsBelow70){
            highiestBelow70 = WeatherUtil.highTempLocation(weather, highiestBelow70);
        
        }
       
        System.out.println("Final Result with imperetive style::"+highiestBelow70.getCity() +" "+ highiestBelow70.getTemp());
        long end = System.nanoTime();

        System.out.println("Time taken by imperetive style " + (end - start));

        start = System.nanoTime();
        highiestBelow70 = Locations.locations.stream()
                .map(WeatherUtil::findWeatherByZipCode)
                .filter(weather -> weather.getTemp() < 70)
                .reduce(new Weather(),WeatherUtil :: highTempLocation);
        System.out.println("Final Result with stream::"+highiestBelow70.getCity() +" "+ highiestBelow70.getTemp());
        
        end = System.nanoTime();
        
        System.out.println("Time taken with stream "+ (end - start));
        
        start = System.nanoTime();
        highiestBelow70=Locations.locations.stream().parallel()
                .map(WeatherUtil::findWeatherByZipCode)
                .filter(weather->weather.getTemp()<70)
                .reduce(new Weather(),WeatherUtil::highTempLocation);
		
	System.out.println("Final Result with parallel stream ::"+highiestBelow70.getCity() +" "+ highiestBelow70.getTemp());

        end = System.nanoTime();
        System.out.println("Time taken by parallel stream "+(end-start));
        
                
    }
}
