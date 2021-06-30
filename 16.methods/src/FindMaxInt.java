import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

    public static void main(String[] args) {
        int[] intArray = inputIntArray();
        int maxInt = findMaxIntInArray(intArray);

        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
    }

    private static int[] inputIntArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");
        String[] stringArray = sc.nextLine().split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }


    public static int findMaxIntInArray(int[] intArray) {
        int maxInt = Integer.MIN_VALUE;
        for(Integer n: intArray)
            if (maxInt < n) maxInt = n;
        return maxInt;
    }
}
