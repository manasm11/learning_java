import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForEachLoop {
    private static class Phone {
        Integer price;
        String model;

        public Phone(String model, Integer price) {
            this.model = model;
            this.price = price;
        }

        public void show() {
            System.out.printf("Model=%s, Price=%d%n", model, price);
        }
    }

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung", 90));
        phones.add(new Phone("Micromax", 120));
        phones.add(new Phone("Disney", 92));
        phones.add(new Phone("Apple", 10));
        phones.add(new Phone("Dominos", 200));

        System.out.println("========== Before Sorting");
        phones.forEach(Phone::show);
        phones.sort(Comparator.comparing(phone -> phone.model));
        System.out.printf("%n========== After Sorting%n");
        phones.forEach(Phone::show);
    }
}
