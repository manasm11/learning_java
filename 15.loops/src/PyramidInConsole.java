import java.util.Scanner;

public class PyramidInConsole {

    public static void main(String[] args) {
        System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            printRow(i+1);
        }
        for (int i = 0; i < n - 1; i++) {
            printRow(n-i-1);
        }
    }

    private static void printRow(Integer length){
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}