import java.util.Scanner;

public class EmptyRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {
        drawHorizontalLine(width);
        for (int i = 0; i < width - 2; i++) {
            drawEdgedLine(width);
        }
        drawHorizontalLine(width);
    }

    private static void drawEdgedLine(int width) {
        System.out.print("*");
        for (int i = 0; i < width - 2; i++) System.out.print(" ");
        System.out.println("*");
    }

    private static void drawHorizontalLine(int width) {
        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
    }
}
