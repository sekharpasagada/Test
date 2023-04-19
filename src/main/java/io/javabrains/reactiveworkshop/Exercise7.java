package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

import reactor.core.publisher.Flux;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

    	//ReactiveSources.intNumbersFlux().filter(i -> i > 5).subscribe(s -> System.out.println(s));
    	
    	//ReactiveSources.intNumbersFlux().filter(i -> i > 5).map(i -> i*10).subscribe(s -> System.out.println(s));
    	
    //	ReactiveSources.intNumbersFlux().filter(i -> i > 5).take(3).map(i -> i*10).subscribe(s -> System.out.println(s));
    
    	//ReactiveSources.intNumbersFlux().filter(i -> i > 20).defaultIfEmpty(-1).subscribe(s -> System.out.println(s));
    	
      
    	//ReactiveSources.intNumbersFlux().flatMap(i -> ReactiveSources.userFlux().filter(user -> user.getId()==i)).log().subscribe(s ->System.out.println(s));
        
    	
    //	ReactiveSources.intNumbersFluxWithRepeat().log().distinct().subscribe(s -> System.out.println("unique :"+s));

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

    	ReactiveSources.intNumbersFluxWithRepeat().log().distinctUntilChanged().subscribe(s -> System.out.println("subsequent repetitions :"+s));
        
System.out.println("Press a key to end");
System.in.read();
    }

}
