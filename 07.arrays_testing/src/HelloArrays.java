import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloArrays {
    public static void main(String[] args) {
        var a = new int[10][10];
        Integer[] another_array = {1, 4, 5, 2, 3};
        System.out.println(Arrays.toString(another_array));
        System.out.println(another_array);
        Arrays.sort(another_array);
        System.out.println(toList(another_array));
        Collections.reverse(toList(another_array));
        System.out.println(toList(another_array));
    }

    private static List<Integer> toList(Integer[] another_array) {
        return Arrays.asList(another_array);
    }
}