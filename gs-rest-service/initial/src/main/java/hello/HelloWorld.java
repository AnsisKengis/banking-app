package hello;

import org.joda.time.LocalTime;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        ArrayList<String> myArray = new ArrayList<>();
        myArray.add(greeter.helloAnsis());
        System.out.println(greeter.helloAnsis());
    }
}