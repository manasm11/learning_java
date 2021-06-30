public class SimpleCalculator {
    public static void main(String[] args) {
        boolean isFloating = false;
        Double sum_float = null;
        Integer sum_int = null;
        for (String arg : args) if (arg.contains(".")) isFloating = true;
        if (isFloating) {
            sum_float = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
        } else {
            sum_int = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        }
        if (sum_float != null) System.out.println(sum_float);
        if (sum_int != null) System.out.println(sum_int);
    }
}
