public class RunnableExperiment {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(RunnableExperiment::someFunction);
            thread.start();
        }
        someFunction();
    }

    static void someFunction() {
        System.out.println(
                "I'm a new thread! My name is " + Thread.currentThread().getName()
        );
    }
}
