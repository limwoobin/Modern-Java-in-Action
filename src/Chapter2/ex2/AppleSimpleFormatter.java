package Chapter2.ex2;

public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple a) {
        return "An apple of " + a.getWeight() + "g";
    }
}
