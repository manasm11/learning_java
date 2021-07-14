class PingPongClass {
    synchronized void ping() {
        while (true) {
            System.out.println("PING");
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    synchronized void pong() {
        while (true) {
            System.out.println("PONG");
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}

public class PingPong {
    public static void main(String[] args) {
        PingPongClass p = new PingPongClass();
        new Thread(p::ping).start();
        new Thread(p::pong).start();
    }
}
