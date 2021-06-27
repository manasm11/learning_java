public class HelloWorldAgain {
    public static void main(String[] args) {
        log("Hello");
        new WillThisBeImported().yes();
    }
    static void log(String msg) {
        System.out.println(msg);
    }
}
