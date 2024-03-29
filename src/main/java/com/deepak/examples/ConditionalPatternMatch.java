package com.deepak.examples;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;
import static io.vavr.Predicates.is;

public class ConditionalPatternMatch {
    public static void main(String[] args) {
        //conditional pattern
        String conditional = Match(1).of(
                Case($(is(1)), i -> "one" + i),
                Case($(is(2)), i -> "two" + i),
                Case($(), "default")
        );
        System.out.println(conditional); // one
    }
}
