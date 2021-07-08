import java.util.Arrays;
import java.util.List;

public class Present {
    // the method filters sweets by sugar weight inclusively
    List<Sweet> sweets;

    public Present(Sweet[] sweets) {
        this.sweets = Arrays.asList(sweets);
    }

    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        return sweets.stream()
                .filter(sweet -> sweet.sugarWeight >= minSugarWeight && sweet.sugarWeight <= maxSugarWeight)
                .toArray(Sweet[]::new);
    }

    // the method calculates total weight of the present
    public double calculateTotalWeight() {
        return sweets.stream()
                .mapToDouble(Sweet::getWeight)
                .sum();
    }

    // the method that adds sweet to the present
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    // the method returns copy of the Sweet[] array so that nobody could
// modify state of the present without addSweet() method.
// Also array shouldn’t contain null values.
    public Sweet[] getSweets() {
        return sweets.toArray(Sweet[]::new);
    }

}
