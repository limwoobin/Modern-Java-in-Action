package Chapter1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static Chapter1.ex1.Color.GREEN;

public class AppleFilter {
    public static List<Apple> filterApples(List<Apple> inventory , Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // 메서드 전달
        List<Apple> inventory = List.of(new Apple(GREEN , 100) , new Apple(Color.RED , 50));
        List<Apple> greenApples = filterApples(inventory , Apple::isGreenApple);
        List<Apple> heavyApples = filterApples(inventory , Apple::isHeavyApple);

        // 메서드 전달에서 람다로
        List<Apple> greenApples2 = filterApples(inventory , (Apple a) -> GREEN.equals(a.getColor()));
        List<Apple> heavyApples2 = filterApples(inventory , (Apple a) -> 150 > a.getWeight());
    }
}
