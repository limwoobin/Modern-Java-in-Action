package Chapter3.ex1;

public class LambdaEx {
    // 람다 사용
    static Runnable r1 = () -> System.out.println("Hello world 1");

    // 익명 클래스 사용
    static Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello world 2");
        }
    };

    static void process(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        process(r1);
        process(r2);
        process(() -> System.out.println("Hello world 3")); // 직접 람다 전달
    }
}
