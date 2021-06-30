import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();


        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        string = string.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (String s : string.split(" ")) {
            if (s.length() > 0)
                result.append(s.substring(0, 1).toUpperCase());
            if (s.length() > 1)
                result.append(s.substring(1));
            result.append(" ");
        }
        return result.toString();
    }
}