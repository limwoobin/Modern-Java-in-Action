package Chapter2.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Filters {

    static <T> List<T> filter(List<T> list , Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = List.of(new Apple(Color.RED , 140) , new Apple(Color.GREEN , 50));
        List<Apple> redApples = filter(inventory , (Apple apple) -> Color.RED.equals(apple.getColor()));

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumbers = filter(numbers , (Integer i) -> i % 2 == 0);


        System.out.println(numbers);
    }
}
