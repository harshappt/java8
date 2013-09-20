/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.interfaces;

/**
 *
 * @author harsha
 */
public class DefaultMethods {
    public static void main(String a[]){
        Clazz clazz = new Clazz();
        clazz.abstractMethod();
        clazz.defaultMethod();
    }
    
    static class Clazz implements Interface1,Interface2{

        @Override
        public void abstractMethod() {
            System.out.println("This is Clazz abstractMethod implementation..!");
        }
    
        @Override
        public void defaultMethod(){
           // Interface2.super.defaultMethod();
        }
    }
    
    interface Interface1{
        void abstractMethod();
        default void defaultMethod(){
            System.out.println("Interface1 defaultMethod");
        }
        
    }
    
    interface Interface2{
        default void defaultMethod(){
            System.out.println("Interface2 defaultMethod");
        }
    }
}
