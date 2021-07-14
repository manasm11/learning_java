public class DeadlockDemo {
    final static Object lock1 = new Object();
    final static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(DeadlockDemo::proc1).start();
//        new Thread(DeadlockDemo::proc2).start();
        new Thread(DeadlockDemo::proc3).start();

        // To remove deadlock, ensure the sequence of acquiring locks in same in all functions.


    }

    static void proc1() {
        synchronized (lock1) {
            System.out.println("Lock 1 acquired by proc1");
            synchronized (lock2) {
                System.out.println("Lock 2 acquired by proc1");
            }
        }
    }

    static void proc2() {
        synchronized (lock2) {
            System.out.println("Lock 2 acquired by proc1");
            synchronized (lock1) {
                System.out.println("Lock 1 acquired by proc1");
            }
        }
    }

    static void proc3() {
        synchronized (lock1) {
            System.out.println("Lock 1 acquired by proc3");
            synchronized (lock2) {
                System.out.println("Lock 2 acquired by proc3");
            }
        }
    }
}
