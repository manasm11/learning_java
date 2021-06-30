public class PrintMatrixToConsole {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i :row) {
                System.out.print("\t"+i);
            }
            System.out.println();
        }
    }
}