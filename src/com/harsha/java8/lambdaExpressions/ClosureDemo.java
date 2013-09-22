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
public class ClosureDemo {

    interface FuncInterface{
        int onlyAbstractMethod(int i);
    }
    
    private static FuncInterface closureMethod(){
    
        int j =0;
        FuncInterface f = i->{i++;System.out.println(j);return i;};
         
        return f;
    }
    
    //http://cr.openjdk.java.net/~briangoetz/lambda/lambda-state-final.html
    //These were previously called SAM Types, which stood for "Single Abstract Method"
    
    public static void main(String[] args) {
        FuncInterface closureMethod1 = closureMethod();
        FuncInterface closureMethod2 = closureMethod();
        
        closureMethod1.onlyAbstractMethod(1);
        
        closureMethod2.onlyAbstractMethod(2);
        
        closureMethod1.onlyAbstractMethod(5);
        
        closureMethod2.onlyAbstractMethod(10);
    }
}

/*

To illustrate, here is a sampling of some of the functional interfaces already in Java SE 7 that are well-suited for being used with the new language features; the examples that follow illustrate the use of a few of them.

java.lang.Runnable
java.util.concurrent.Callable
java.security.PrivilegedAction
java.util.Comparator
java.io.FileFilter
java.beans.PropertyChangeListener

The general syntax consists of an argument list, the arrow token ->, and a body. The body can either be a single expression, or a statement block. In the expression form, the body is simply evaluated and returned. In the block form, the body is evaluated like a method body -- a return statement returns control to the caller of the anonymous method
*/