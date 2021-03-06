/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsha.java8.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.stream.Collectors;
import org.codehaus.jackson.map.ObjectMapper;



/**
 *
 * @author harsha
 */
public class WeatherUtil {
     public static Weather findWeatherByZipCode(int zipCode) {
        try{
          URL url = new URL("http://query.yahooapis.com/v1/public/yql?q=select%20item%20from%20weather.forecast%20where%20location%3D%22"+zipCode+"%22&format=json");
            final BufferedReader reader
                    = new BufferedReader(new InputStreamReader(url.openStream()));
            String collect = reader.lines().filter(string->string.contains("location") || string.contains("temp")).collect(Collectors.joining());
            
            ObjectMapper mapper = new ObjectMapper();
            HashMap readValue = mapper.readValue(collect, java.util.HashMap.class);
        
            String temp =(String)((HashMap)((HashMap)((HashMap)((HashMap)((HashMap)readValue.get("query")).get("results")).get("channel")).get("item")).get("condition")).get("temp");
            String text =(String)((HashMap)((HashMap)((HashMap)((HashMap)readValue.get("query")).get("results")).get("channel")).get("item")).get("title");
            
            return new Weather(zipCode,text,new Integer(temp));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
     
     public static Weather highTempLocation(Weather w1, Weather w2){
         return w1.getTemp() > w2.getTemp() ? w1 : w2;
     }



}
