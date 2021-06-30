import java.util.Random;

public class GenerateRandomIntegers {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100)); // from 0 to 99
        System.out.println(r.nextInt(100)+1); // from 1 to 100
    }
}
