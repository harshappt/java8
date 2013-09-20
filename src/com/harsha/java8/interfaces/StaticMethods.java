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
public class StaticMethods {
    public static void main(String a []){
        InterfaceWithStaticMethod.staticMethod();
    }
    
    interface InterfaceWithStaticMethod{
        static void staticMethod(){
            System.out.println("Interface A staticMethod()");
        }
    }
}
