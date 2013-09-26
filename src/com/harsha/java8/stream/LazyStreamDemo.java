/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author harsha
 */
public class LazyStreamDemo {
    
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    //square of the first even number greater than 3 from the list
    
    System.out.println(
      numbers.stream()
      .filter(i->i>2)
      .filter(i->i%2==0)
      .mapToInt(i->i*i)
      .findFirst()
      .getAsInt()
    );
  }

        
        
    
    
}
