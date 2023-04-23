package io.javabrains.reactiveworkshop;

import java.util.stream.Stream;
//First Exercise
public class Exercise1 {

    public static void main(String[] args) {

    	
    	
    	Stream<Integer> numbersStream = StreamSources.intNumbersStream();
    	numbersStream.forEach(s -> System.out.println(s));
    	numbersStream.close();
    	
    	numbersStream = StreamSources.intNumbersStream();
       numbersStream.filter(i -> i < 5).forEach(s -> System.out.println(s));
       numbersStream.close();
   	
   	numbersStream = StreamSources.intNumbersStream();
       
       
       numbersStream.filter(i -> i > 5).skip(1).limit(2).forEach(System.out::println);
    
       numbersStream.close();
      	
      	numbersStream = StreamSources.intNumbersStream();
        Integer integer = numbersStream.filter(i -> i > 30).findFirst().orElse(-1);
        System.out.println(integer);
        numbersStream.close();
    
        Stream<User> userStream = StreamSources.userStream();
    	userStream.forEach(user ->   System.out.println(user.getFirstName()));
       
    	userStream.close();
    	System.out.println("***************");
    	userStream = StreamSources.userStream();
    	numbersStream = StreamSources.intNumbersStream();
    	numbersStream.flatMap( i ->  StreamSources.userStream().filter(user -> user.getId() == i.intValue()))
    	.map(user -> user.getFirstName()).forEach(System.out::println);
    	
    	System.out.println("**********");
    	Stream<String> stringStream = Stream.of("sekhar","Anusha","dhanvith","Haasith");
    	
    	stringStream.flatMap(s -> Stream.of(s.charAt(0))).forEach(System.out::print);;
    	
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

    	userStream.close();
    	numbersStream.close();
    	userStream = StreamSources.userStream();
    	userStream.filter(user -> StreamSources.intNumbersStream().anyMatch(i -> user.getId() == i.intValue())).forEach(System.out::println);
    	
    }

}
