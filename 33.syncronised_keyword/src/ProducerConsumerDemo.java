import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Warehouse {
    static final int MAX_CAPACITY = 500;
    final List<Integer> items = new ArrayList<>();

    public void addItems() {
        while (true) {
            synchronized (items) {
                if (items.size() >= MAX_CAPACITY) {
                    try {
                        items.wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                items.add(new Random().nextInt());
                System.out.println("ADD: " + items.size());
                items.notify();
            }
        }
    }

    public void removeItems() {
        while (true) {
            synchronized (items) {
                if (items.size() <= 0) {
                    try {
                        items.wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                items.remove(0);
                System.out.println("REMOVE: " + items.size());
                items.notify();
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        new Thread(w::addItems).start();
        new Thread(w::removeItems).start();
    }
}
