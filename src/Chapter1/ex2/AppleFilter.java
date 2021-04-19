package Chapter1.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class AppleFilter {

    // 순차 처리
    static void heavyFilter(List<Apple> inventory) {
        List<Apple> heavyApples = inventory.stream()
                .filter((Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
    }

    // 병렬 처리
    static void heavyFilter2(List<Apple> inventory) {
        List<Apple> heavyApples = inventory.parallelStream()
                .filter((Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
    }
}
