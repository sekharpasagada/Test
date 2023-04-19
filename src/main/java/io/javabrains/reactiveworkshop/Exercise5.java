package io.javabrains.reactiveworkshop;

import java.io.IOException;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
    	ReactiveSources.intNumberMono().doOnError(e -> System.err.println("Error.."+e))
    	.doOnSuccess(s -> System.out.println("Completed "+s))
    	.subscribe(s -> System.out.println(s));
    	
    	ReactiveSources.userFlux().subscribe(s -> System.out.println(s), e -> System.err.println("Error.."+e),
    			() -> System.out.println("Completed "));
    	
        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
    	
    	ReactiveSources.userFlux().subscribe( new FirstSubscriber());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class FirstSubscriber<T> extends BaseSubscriber<T>
{
	@Override
	protected void hookOnNext(T value) {
	System.out.println("My hook on Next: "+value);
		super.hookOnNext(value);
	
	}
	
	@Override
	protected void hookOnError(Throwable throwable) {
		// TODO Auto-generated method stub
		System.out.println("My hook on error: "+throwable.getMessage());
		super.hookOnError(throwable);
	}
	
	@Override
	protected void hookOnComplete() {
		// TODO Auto-generated method stub
		System.out.println("My hook on Complete: ");
		super.hookOnComplete();
	}
}
