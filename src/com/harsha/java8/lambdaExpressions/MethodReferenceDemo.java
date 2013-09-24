/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.lambdaExpressions;

/**
 *
 * @author harsha
 */
public class MethodReferenceDemo {

    public MethodReferenceDemo() {
         System.out.println("Contructor in MethodReference");
    }
     
    public static void main(String[] args) {
        MethodReferenceDemo demo = new MethodReferenceDemo();
        demo.executeLambda(MethodReferenceDemo :: staticMethod);
        demo.executeLambda(demo :: instanceMethod);
        demo.executeLambda(MethodReferenceDemo :: new );
    }
    
    private void executeLambda(FuncInterface fi){
        fi.abstractMethod();
    }
    
    private static void staticMethod(){
        System.out.println("static method in MethodReferenceDemo");
    }
    
    private void instanceMethod(){
        System.out.println("instanceMethod in MethodReferenceDemo");
    }
    
    interface FuncInterface{
        public void abstractMethod();
    }
    
    
    
}


