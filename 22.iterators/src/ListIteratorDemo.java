import java.util.*;


public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println("=============== Before iteration");
        System.out.println(list);
        ListIterator<Integer> listIterator = list.listIterator(2);

        System.out.println(listIterator.previous());
        listIterator.add(999);
        listIterator.next();
        listIterator.next();
        listIterator.remove();

        System.out.println("================== After iteration");
        System.out.println(list);
    }
}
