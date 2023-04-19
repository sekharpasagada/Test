package io.javabrains.reactiveworkshop;

import java.io.IOException;

import reactor.core.publisher.Flux;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

    	Flux<Integer> numbersFlux = ReactiveSources.intNumbersFlux();
    	//numbersFlux.toIterable().forEach(System.out::println);
    
   	numbersFlux.subscribe(integer -> System.out.println(integer));
        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
    	
    //	ReactiveSources.userFlux().toIterable().forEach(System.out::println);

    	ReactiveSources.userFlux().subscribe(user -> System.out.println( user.toString()));
        System.out.println("Press a key to end");
        System.in.read();
        
    }

}
