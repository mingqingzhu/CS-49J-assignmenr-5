import java.util.Random;

public class Matrix {
    private int[][] matrixIn;
    private  int[][] matrixOut;
    private int sum;
    private int n;

    public Matrix(int n) {
        this.n = n;
        Random generator = new Random(System.currentTimeMillis());
        matrixIn = new int[n][n];
        matrixOut = new int[n][n];
        System.out.println("The input matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixIn[i][j] = generator.nextInt(10));
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public int sumMajorDiagonal() {
        for (int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrixIn[i][j];
                }
            }
        }
        return sum;
    }

    public int[][] transposeMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixOut[j][i] = matrixIn[i][j];
            }
        }
        return matrixOut;
    }
}
