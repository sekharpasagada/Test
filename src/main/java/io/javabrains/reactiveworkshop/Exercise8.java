package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

    	//ReactiveSources.intNumbersFluxWithException().doOnError(e -> System.out.println(e.getMessage())).subscribe(s -> System.out.println("s: "+s));
    	
        // Print values from intNumbersFluxWithException and print a message when error happens
        // TODO: Write code here

    	
  /*  	ReactiveSources.intNumbersFluxWithException().log()
    //	.onErrorContinue(RuntimeException.class, (e,r) -> System.out.println(e.getMessage()+"  "))
    	 .onErrorContinue((throwable, item) -> System.out.println("on error continue. " + throwable.getMessage() +item.getClass()))
    	.doOnError(e -> System.out.println(e.getMessage())).subscribe(s -> System.out.println("s: "+s));
   */ 	
        // Print values from intNumbersFluxWithException and continue on errors
        // TODO: Write code here

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        // TODO: Write code here
    	
   /* 	ReactiveSources.intNumbersFluxWithException().log()
    	.onErrorResume(err -> Flux.just(-1,-2))
        //	.onErrorContinue(RuntimeException.class, (e,r) -> System.out.println(e.getMessage()+"  "))
     //   	 .onErrorContinue((throwable, item) -> System.out.println("new error continue. " + throwable.getMessage() +item.getClass()))
        	.doOnError(e -> System.out.println(e.getMessage())).subscribe(s -> System.out.println("s: "+s));
    */
    	
    	 ReactiveSources.intNumbersFluxWithException()
         .onErrorResume(err -> Flux.just(-1, -2))
         .subscribe(integer -> System.out.println(integer));


        System.out.println("Press a key to end");
        System.in.read();
    }

}
