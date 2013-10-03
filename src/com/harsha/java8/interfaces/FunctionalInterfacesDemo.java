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
public class FunctionalInterfacesDemo {

    public static void main(String args[]) {
        System.out.println("");
    }

    @FunctionalInterface
    interface Interface1 {

        void abstractMethod();

        //void abstractMethod1();
    }
    
    //functional interfaces already in Java SE 7
    
    /*  
        java.lang.Runnable
        java.util.concurrent.Callable
        java.security.PrivilegedAction
        java.util.Comparatoro
        java.io.FileFilter
        java.beans.PropertyChangeListener
        */

    
    //Java SE 8 adds a new package, java.util.function, which contains functional interfaces that are expected to be commonly used, such as:

        /*
            Predicate<T> -- a boolean-valued property of an object
            Consumer<T> -- an action to be performed on an object
            Function<T,R> -- a function transforming a T to a R
            Supplier<T> -- provide an instance of a T (such as a factory)
            UnaryOperator<T> -- a function from T to T
            BinaryOperator<T> -- a function from (T, T) to T
       */
}
