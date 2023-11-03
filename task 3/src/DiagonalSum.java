public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int diagonalSum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            diagonalSum += matrix[i][i];
        }


        System.out.println("Matrix 10x10 with diagonal values:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}