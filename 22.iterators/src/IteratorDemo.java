import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(123);
        list.add(432);
        list.add(154);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
            if (i % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println("=========== Printing all elements.");
        list.forEach(System.out::println);
    }
}
