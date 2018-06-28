package main.java.hello;

/**
 * Created by guoyifeng on 6/28/18.
 */
import org.joda.time.LocalTime;

/**
 * A study project to learn how to build java projects with Gradle
 * https://spring.io/guides/gs/gradle/
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}