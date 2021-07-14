import java.util.concurrent.TimeUnit;

public class LoadingSimulator {
    public static void main(String[] args) throws InterruptedException {
        Thread loaderThread = new Thread(() -> loader("Task Completed", "Doing the task"), "LOADER");
        Thread processThread = new Thread(LoadingSimulator::timeTakingProcess, "TIME TAKING PROCESS");

        processThread.start();
        loaderThread.start();
        processThread.join();
        loaderThread.interrupt();
    }

    static void loader(String completionMessage, String loadingMessage) {
        int i = 0;
        if (loadingMessage.isEmpty() || loadingMessage.isBlank()) loadingMessage = "Loading";
        loadingMessage = "\r" + loadingMessage;
        while (true) {
            switch (i % 3) {
                case 0 -> System.out.print(loadingMessage + ".  ");
                case 1 -> System.out.print(loadingMessage + ".. ");
                case 2 -> System.out.print(loadingMessage + "...");
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                i++;
            } catch (InterruptedException e) {
                System.out.println("\r" + completionMessage);
                break;
            }
        }
    }

    static void timeTakingProcess() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
