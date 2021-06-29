import java.util.Scanner;

public class App02_AddTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);
//        Integer a = sc.nextInt();
//        Integer b = sc.nextInt();
        System.out.println(a+b);
    }
}
