package it.radium.functionalInterface;

import java.util.function.Consumer;

public class Functional {

    public static void main(String[] args) {
// Functional Interface using lambda
        Consumer<String> consumer=(s)->{
            System.out.println( s.toUpperCase());};

        consumer.accept("NullpointerException");

    }



}
