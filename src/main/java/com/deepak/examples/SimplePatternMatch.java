package com.deepak.examples;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

public class SimplePatternMatch {
    public static void main(String[] args) {
        String number = Match(2).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(), "default")
        );
        
        System.out.println(number); // two
    }
}
