public class Task02 {
    public static void main(String[] args) {

        int[] Array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PrintMatrix(Array1);
        System.out.println();

        String[] Array2 = new String[]{"яблоко", "банан", "апельсин", "виноград", "ананс"};
        PrintMatrix(Array2);
        System.out.println();

        int[][] Array3 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        PrintMatrix(Array3);
        System.out.println();

        float[][] Array4 = new float[][]{
                {1.5f, 2.5f},
                {3.5f, 4.5f},
                {5.5f, 6.5f},
                {7.5f, 8.5f}
        };
        PrintMatrix(Array4);

    }

    static void PrintMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void PrintMatrix(float[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void PrintMatrix(String[] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i] + " ");
        }
    }

    static void PrintMatrix(int[] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i] + " ");
        }
    }
}
