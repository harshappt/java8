/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.collection;

/**
 *
 * @author harsha
 */
public class Weather {
    private int zipCode;
    private String city;
    private int temp;


   public Weather(int zipCode, String city, int temp){
       this.zipCode = zipCode;
       this.city = city;
       this.temp = temp;
   }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    
    
}
