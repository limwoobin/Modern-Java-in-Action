package Chapter2.ex1;

public class AppleRedAndHeavyPredicate implements ApplePredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return Color.RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
