package com.app.work;


public class AnonymousOperatons {
    public static void main(String[] args) {
        // Anonymous class implementing Greeting interface
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };

        Greeting greet1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("this is my another implementation!");
            }
        };

        greet.sayHello();
        
        AnonymousOperatons obj = new AnonymousOperatons();
        obj.print(greet1);
    }
    
    
    public void print(Greeting obj) {
    	obj.sayHello();
    	System.out.println();
    }
    
}