import java.util.Scanner;

public class Task01 {//сделать мейн + метод детерминанта

    public static void main(String[] args) {
        System.out.println("Диагональная матрица");
        int[][] matrix1 = DiagonalMatrix(3);
        PrintMatrix(matrix1);

        System.out.println("Нулевая матрица" );
        int[][] matrix2 = NullMatrix(3);
        PrintMatrix(matrix2);

        Scanner scan = new Scanner(System.in);
        int scal = scan.nextInt();

        System.out.println("Умножение на число" );
        PrintMatrix(ScalarMatrix(matrix1, scal));

        System.out.println("Сумма" );
        PrintMatrix(SummMatrix(matrix1, matrix2));


        System.out.println("Умножение" );
        PrintMatrix(MultMatrix(matrix1, matrix1));

        System.out.println("Детерменант" + Determinant(matrix1));
    }

    static int[][] DiagonalMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    static int[][] NullMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    static int[][] ScalarMatrix(int[][] matrix, int scal) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * scal;
            }
        }
        return matrix;
    }

    static int Determinant(int[][] matrix) {
        int determ;
        if(matrix.length != matrix[0].length || (matrix.length != 2 && matrix.length != 3)) {
            System.out.println("Не высчитывается");
            return 0;
        }

        if(matrix.length == 3) {
            determ = matrix[0][0]*matrix[1][1]*matrix[2][2] + matrix[0][1]*matrix[1][2]*matrix[2][0] + matrix[0][2]*matrix[1][0]*matrix[2][1] - matrix[0][2]*matrix[1][1]*matrix[2][0] - matrix[0][1]*matrix[1][0]*matrix[2][2] - matrix[0][0]*matrix[1][2]*matrix[2][1];
        } else {
            determ = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        }

        return determ;
    }


    static int[][] SummMatrix(int[][] matrix1, int[][] matrix2) {


        int[][] rez = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                rez[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return rez;
    }

    static int[][] MultMatrix(int[][] matrix1, int[][] matrix2) {

        int[][] rez = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                rez[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return rez;
    }

    static void PrintMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
