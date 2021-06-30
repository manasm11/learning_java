import java.util.Scanner;

public class MatrixRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
    }

    private static boolean rotateMatrix(double[][] matrix, int mode) {
        switch (mode) {
            case 1:
                rotate90(matrix);
                return true;
            case 2:
                rotate180(matrix);
                return true;
            case 3:
                rotate270(matrix);
                return true;
            default:
                return false;
        }
    }

    private static void printMatrixToConsole(double[][] matrix) {
        for(double[] row: matrix){
            for(double item: row){
                System.out.printf("%.1f ", item);
            }
            System.out.println();
        }
    }

    private static double[][] generateMatrix(int size) {
        var matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Double.parseDouble(i + "." + j);
            }
        }
        return matrix;
    }

    public static void rotate90(double[][] matrix) {
        int N = matrix.length;
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group
            // of 4 in current square
            for (int y = x; y < N - x - 1; y++) {
                // Store current cell in
                // temp variable
                double temp = matrix[x][y];

                // Move values from right to top
                matrix[x][y] = matrix[y][N - 1 - x];

                // Move values from bottom to right
                matrix[y][N - 1 - x]
                        = matrix[N - 1 - x][N - 1 - y];

                // Move values from left to bottom
                matrix[N - 1 - x][N - 1 - y] = matrix[N - 1 - y][x];

                // Assign temp to left
                matrix[N - 1 - y][x] = temp;
            }
        }
    }

    public static void rotate180(double[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
    }

    public static void rotate270(double[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
        rotate90(matrix);
    }
}