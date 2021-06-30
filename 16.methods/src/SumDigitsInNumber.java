import java.util.Scanner;

public class SumDigitsInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsInNumber(int number) {
        String numberString = String.valueOf(number);
        int sum = 0;
        for (Character c : numberString.toCharArray())
            if (Character.isDigit(c))
                sum += Integer.parseInt(c.toString());
        return sum;
    }
}