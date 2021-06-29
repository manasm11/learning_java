import java.text.Format;
import java.util.Formatter;

public class PiOutputFormatting {
    public static void main(String[] args) {
        // For regulat expressions, there is an interesting thing known as POSIX characters
        for (int i = 0; i < 5; i++) {
            System.out.printf("%."+(i+1)+"f%n", Math.PI);
        }
    }
}
