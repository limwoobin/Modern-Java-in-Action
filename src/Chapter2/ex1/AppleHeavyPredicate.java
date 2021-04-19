package Chapter2.ex1;

public class AppleHeavyPredicate implements ApplePredicate<Apple> {
    @Override
    public boolean test(Apple apple) {
       return apple.getWeight() > 150;
    }
}
