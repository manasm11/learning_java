import java.util.Scanner;

public class App04_CircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter circle radius: ");
        var radius = sc.nextInt();
        Double circleCircumference = 2.0*Math.PI*radius;

        System.out.println("Circle circumference is: " + circleCircumference);
    }
}
