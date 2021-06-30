public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        System.out.println("===== Convert 1 demo =====");
        System.out.println(convert1(INPUT_DATA));

        System.out.println("===== Convert 2 demo =====");
        System.out.println(convert2(INPUT_DATA));

    }

    public static String convert1(String input) {
        final int USER = 0, NAME = 1, EMAIL = 2;
        StringBuilder s = new StringBuilder();
        boolean first = true;
        for (String line : input.split("\\n")) {
            if (first) {
                first = false;
                continue;
            }
            String[] data = line.split(";");
            s.append(data[USER])
                    .append(" ==> ")
                    .append(data[EMAIL])
                    .append(System.lineSeparator());
        }
        return s.toString();
    }


    public static String convert2(String input) {
        final int USER = 0, NAME = 1, EMAIL = 2;
        StringBuilder s = new StringBuilder();
        boolean first = true;
        for (String line : input.split("\\n")) {
            if (first) {
                first = false;
                continue;
            }
            String[] data = line.split(";");
            s.append(data[NAME])
                    .append(" (email: ")
                    .append(data[EMAIL])
                    .append(")")
                    .append(System.lineSeparator());
        }
        return s.toString();
    }
}
