import java.util.concurrent.atomic.AtomicInteger;

public class AtomicObjectsDemo {
    static Integer integer = 0;
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> integer++).start();
            new Thread(() -> atomicInteger.incrementAndGet()).start();
        }
        System.out.println("integer: " + integer);
        System.out.println("atomicInteger: " + atomicInteger);
    }
}
