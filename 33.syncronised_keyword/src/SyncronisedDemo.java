import java.util.HashSet;
import java.util.Set;

public class SyncronisedDemo {
    private static int countSync = 0;
    private static int count = 0;

    public static void main(String[] args) {
        Set<Thread> threads = new HashSet<>();
        Set<Thread> threadsSync = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(SyncronisedDemo::increment);
            Thread ts = new Thread(SyncronisedDemo::incrementSync);
            t.start();
            ts.start();
            threads.add(t);
            threadsSync.add(ts);
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Thread t : threadsSync) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("count : " + count);
        System.out.println("countSync : " + countSync);
    }

    private static synchronized void incrementSync() {
        countSync++;
    }

    private static void increment() {
        count++;
    }
}
