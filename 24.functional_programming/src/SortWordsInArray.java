import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.*;

public class SortWordsInArray {

    public static void main(String[] args) {
        System.out.print("Please, enter words separated by space: ");
        String[] words = new Scanner(System.in).nextLine().split(" +");
        sort(words, Comparator.comparing(word -> -word.length()));
        asList(words).forEach(word -> System.out.print(word + " "));
    }
}
