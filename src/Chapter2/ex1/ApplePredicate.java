package Chapter2.ex1;


@FunctionalInterface
public interface ApplePredicate<T> {
    boolean test(T t);
}
