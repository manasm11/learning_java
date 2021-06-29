import java.math.BigDecimal;
import java.math.RoundingMode;

public class DividingFee {
    public static void main(String[] args) {
        var fees = BigDecimal.valueOf(20).setScale(2);
        var people = BigDecimal.valueOf(3);
        var feePerPerson = fees.divide(people, RoundingMode.HALF_UP);
        System.out.println("Total fees: " + feePerPerson);
    }
}
