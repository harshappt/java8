/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsha.java8.librarychanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author harsha
 */
public class WeatherUtil {
    //http://www.weather.com/weather/today/84123

    public static void main(String[] args) {
        findCurrentTempInF(84123);
    }

    public static int findCurrentTempInF(int zipcode) {
        try {
            //w=woeid
            URL url = new URL("http://weather.yahooapis.com/forecastrss?w=2398528");
            final BufferedReader reader
                    = new BufferedReader(new InputStreamReader(url.openStream()));
            //final String data = reader.lines().substream(1).findFirst().get();
            reader.lines().forEach((line)->System.out.println(line));
            //System.out.println(data);
        } catch (MalformedURLException ex) {

            
        } catch (IOException ex) {
            
        }

        return 0;
    }
}
