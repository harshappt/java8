/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author harsha
 */
public class SideEffects {
    private static ArrayList<Integer> results = new ArrayList<>();
    public static void main(String[] args) {
     
        Thread t1 = new Thread(()->{produceResult(Arrays.asList(1,2,3,4,5,6,7,8,9,10));});
        produceResult(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        System.out.println("");
    }
    
    private static void produceResult(List<Integer> numbers){
        numbers.stream().filter(i->i>10).map(i->i*i).forEach(i->results.add(i));
    }
    
    
}
