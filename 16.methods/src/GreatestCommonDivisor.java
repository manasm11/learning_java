import java.util.Scanner;

public class GreatestCommonDivisor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter two numbers separated by space: ");
        String userInput = sc.nextLine();

        String[] inputArgumentsArray = userInput.split("\\s+");
        int number1 = Integer.parseInt(inputArgumentsArray[0]);
        int number2 = Integer.parseInt(inputArgumentsArray[1]);

        System.out.println(gcdRecursive(number1, number2));
    }

    public static int gcdRecursive(int firstNumber, int secondNumber) {
        int smaller = Math.min(firstNumber, secondNumber);
        int larger = Math.max(firstNumber, secondNumber);
        if(larger%smaller == 0) return smaller;
        return gcdRecursive(larger%smaller, smaller);
    }
}