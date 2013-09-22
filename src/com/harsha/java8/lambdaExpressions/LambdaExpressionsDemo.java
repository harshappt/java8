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
public class LambdaExpressionsDemo {
    public static void main(String[] args) {
 
        shapeDrawer(()->System.out.println("I am a rectangle"));
        
        //Following anonymous class is bulk and this is called vertical problem
        printOperationResult(1, 2, new IntegerOperation() {
            @Override
            public int operation(int t, int u) {
               return t+u;
            }
        });
        
        /*
        Syntax consists of an argument list, 
        the arrow token ->, and a body. 
        The body can either be a single expression, or a statement block.
        If the body is an expression, the body is simply evaluated and returned. 
        If the body is an expression, the body is evaluated like a method body -- a return statement returns control to the caller of the anonymous method;
        */
        
        //Concise
        printOperationResult(4, 5, (int t, int u) -> {return t * u;});
        printOperationResult(20, 5, (t,u)->t/u);
        
        
        
        //Lambda block
        printOperationResult(4, 5, (t,u)->{System.out.println("value of t is " + t); System.out.println("value of u is "+u);return t - u;});
        
        //It is possible to treat an existing method as an instance of a functional interface.
        //method reference
        printOperationResult(10, 2, new LambdaExpressionsDemo() :: subtract);
        
      }
    
    
    
    private int subtract(int a, int b){
        return a-b;
    }
    
        
    
    static void shapeDrawer(Shape shape){
        shape.draw();
    }
    
    
    static void printOperationResult(int t, int u, IntegerOperation op){
        System.out.println(op.operation(t, u));
    }
    

    
    interface Shape{
        void draw();
       
    }
    
    interface IntegerOperation{
        int operation(int t, int u);
    }
    
    
}
