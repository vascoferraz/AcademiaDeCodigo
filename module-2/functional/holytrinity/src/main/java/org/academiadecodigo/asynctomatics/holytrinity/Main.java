package org.academiadecodigo.asynctomatics.holytrinity;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        //map filter reduce

        String newMessage = Stream.of(message.split(" "))
                .filter(string -> !string.equals("garbage"))
                .map(String::toUpperCase)
                .reduce("", (counter, string) -> counter + string + " ")
                .trim(); // This method returns a copy of the string, with leading and trailing whitespace omitted.
        System.out.println(newMessage);
    }
}
