/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.harsha.java8.targetTyping;

/**
 *
 * @author harsha
 */
public class TargetTypeDemo {
    
    interface A{
        void abstractMethod();
    }
    
    interface B{
        void abstractMethod();
    }
    
    public static void main(String[] args) {
        A a /*A is target type*/ = ()/*argument lists*/->{System.out.println("Something");/*body*/};
        B b = ()->{System.out.println("Something");};
        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
}


//Same lambda expression have different types in different contexts.
//In the above example both lambda expressions are same but used in different contexts.

// in line 32 expression represents the instance of A and in line 33 expression represents b.
//Compiler is smart enough to infer the type of each expression based on the context. this type is called the target type. A lambda expression can only appear in a context whose target type is a functional interface.




