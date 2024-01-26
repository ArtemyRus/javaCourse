package lr9.example16;

import java.util.Random;

public class Matrix {
    private int[][] matrix;
    private int row, col;
    Matrix(int r, int c){
        matrix = new int[r][c];
        row = r;
        col = c;
        Random random = new Random();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = random.nextInt(10,100);
    }

    public void printMatrix(){
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++)
                System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    public void printColumn(int c){
        for (int i = 0; i < row; i++)
            System.out.println(matrix[i][c - 1]);
    }
}
