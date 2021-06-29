import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class App03_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = inputSide("A", sc);
        Integer b = inputSide("B", sc);
        Integer c = inputSide("C", sc);
        Double triangleArea = calculateArea(a, b, c);
        System.out.println("Triangle area is: " + triangleArea);
    }

    private static Double calculateArea(Integer a, Integer b, Integer c) {
        Double a2 = Double.valueOf(a);
        Double p = (a2+b+c)/2;
        Double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    private static Integer inputSide(String side, Scanner sc) {
        System.out.print("Please, enter " + side + " side of a triangle: ");
        return sc.nextInt();
    }
}
