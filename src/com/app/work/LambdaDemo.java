package com.app.work;

import java.util.Optional;

@FunctionalInterface
interface Greet {
    void sayHello(String name);
 //default   void sayHello1(String name) {
    	//with some implementations
 //   }
}




public class LambdaDemo {
    public static void main(String[] args) {
        Greet greet = (name) ->
        //body
        {
        	System.out.println("Hello " + name + "!");
        	};
        greet.sayHello("Aashish");
        
        
        Calculation cobj = (i,j)->{return i+j;};
        
        Calculation cobj1 = (i,j)->{return i*j;};
        
        LambdaDemo obj = new LambdaDemo();
        obj.print(cobj1);
        
        System.out.println("get name "+obj.getName().isPresent());
        
        if(obj.getName().isPresent()) {
        	System.out.println(obj.getName());
        }
    }
    
    public void print(Calculation cobj) {
    	System.out.println("Hello " +cobj.add(3, 4));
    	
    	
    }
    
    public Optional<String> getName() {
    	return null;
    }
}
