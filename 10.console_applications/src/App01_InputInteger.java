import java.util.Scanner;

public class App01_InputInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Integer i = sc.nextInt();
        System.out.println("You entered: "+i);
    }
}
