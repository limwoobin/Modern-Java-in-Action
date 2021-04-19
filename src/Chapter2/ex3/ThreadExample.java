package Chapter2.ex3;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });

        t.run();

        Thread t2 = new Thread(() -> System.out.println("Hello World2"));
        t2.run();
    }
}
