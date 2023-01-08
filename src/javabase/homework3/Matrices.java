package javabase.homework3;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void creatRadomMatrix(int[][] matrix) {
        Random rand = new Random();
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("matrix can be not null");
        }

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        int[][] matrix3 = new int[numRows][numCols];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("matrix can be not null");
        }

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        double[][] matrix3 = new double[numRows][numCols];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("matrix can be not null");
        }

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        int[][] matrix3 = new int[numRows][numCols];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            throw new IllegalArgumentException("matrix can be not null");
        }

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        double[][] matrix3 = new double[numRows][numCols];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) throw new IllegalArgumentException("matrix can be not null");

        if (!(matrix1[0].length == matrix2.length)) return null;

        int numRows = matrix1.length;
        int numCols = matrix2[0].length;
        int[][] matrix3 = new int[numRows][numCols];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return matrix3;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) throw new IllegalArgumentException("matrix can be not null");

        if (!(matrix1[0].length == matrix2.length)) return null;

        int numRows = matrix1.length;
        int numCols = matrix2[0].length;
        double[][] matrix3 = new double[numRows][numCols];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return matrix3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creat matrix1
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];
        creatRadomMatrix(matrix1);

        // creat matrix2
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];
        creatRadomMatrix(matrix2);

        // print matrix
        System.out.println("matrix1 is: ");
        print(matrix1);
        System.out.println("matrix2 is: ");
        print(matrix2);

        // does have same dimension ?
        System.out.println(haveSameDimension(matrix1, matrix2));
        // add two matrix
        //print(add(matrix1,matrix2));
        //print(subtract(matrix1,matrix2));
        print(multiply(matrix1, matrix2));
    }
}
