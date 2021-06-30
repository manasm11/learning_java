import java.util.Scanner;

public class NewLineForDigit {
    public static void main(String[] args) {
        System.out.print("Please, enter any integer: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next("\\d+");
        for (Character c: input.toCharArray()){
            System.out.println(c);
        }
    }
}
