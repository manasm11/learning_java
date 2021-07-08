import java.util.Objects;

public class Sweet {
    String name;
    Double weight;// Weight is a weight of the specific sweet in kilograms.
    Double sugarWeight; // sugarWeight is a weight of sugar in this sweet in kilograms.

    public Sweet(String name, Double weight, Double sugarWeight) {
        this.name = name;
        this.weight = weight;
        this.sugarWeight = sugarWeight;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarWeight=" + sugarWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sweet)) return false;
        Sweet sweet = (Sweet) o;
        return getName().equals(sweet.getName()) && getWeight().equals(sweet.getWeight()) && getSugarWeight().equals(sweet.getSugarWeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getSugarWeight());
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getSugarWeight() {
        return sugarWeight;
    }
}
