package Chapter2.ex2;

import java.util.List;

public class ApplePrint {
    static void prettyPrintApple(List<Apple> inventory , AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
