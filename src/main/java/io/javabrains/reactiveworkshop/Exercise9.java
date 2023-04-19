package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()
    //	ReactiveSources.intNumbersFlux().doOnComplete(() -> System.out.println(ReactiveSources.intNumbersFlux().count().block())).subscribe(s -> System.out.println("s: "+s));
      
   /* 	ReactiveSources.intNumbersFlux()
      .count().log()
      .subscribe(aLong -> System.out.println(aLong)); */
    	
    	// Print size of intNumbersFlux after the last item returns
        // TODO: Write code here

        // Collect all items of intNumbersFlux into a single list and print it
        // TODO: Write code here
    //	ReactiveSources.intNumbersFlux().collectList().subscribe(i -> System.out.println(i));
//    	.block().forEach(s -> System.out.println("s.."+s));
      //  // Transform to a sequence of sums of adjacent two numbers
        // TODO: Write code here

    	ReactiveSources.intNumbersFlux().buffer(2).map( 
    			i -> {
    				int i1 = i.get(0);
    				
    				if(i.size() == 2)
    				{
    					i1= i1+i.get(1);
    				}
    				return i1;
    			}
    			).subscribe(s -> System.out.println("sout...."+s));
    	
    	
        System.out.println("Press a key to end");
        System.in.read();
    }

}
