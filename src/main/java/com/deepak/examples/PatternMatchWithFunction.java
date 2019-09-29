package com.deepak.examples;

import io.vavr.Function1;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

public class PatternMatchWithFunction {
    public static void main(String[] args) {
        Function1<Integer, String> checkPatternMatch = (value) -> Match(value).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(), "default"));
    
        //using function calls
        System.out.println(checkPatternMatch.apply(1) + " Finally"); // one
    
    }
}
