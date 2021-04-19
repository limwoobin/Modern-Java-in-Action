package Chapter2.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN , 100));
        inventory.add(new Apple(Color.RED , 150));
        inventory.add(new Apple(Color.GREEN , 80));

        print(inventory);

        inventory.sort(new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight() - a2.getWeight();
            }
        });

        print(inventory);

        inventory.sort((Apple a1 , Apple a2) -> a2.getWeight() - a1.getWeight());
        print(inventory);
    }

    static void print(List<Apple> inventory) {
        System.out.println("---------------------------------------------");
        for (Apple apple : inventory) {
            System.out.println(apple.toString());
        }
    }
}
