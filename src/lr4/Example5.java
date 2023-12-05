package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int line = 3, column = 7;
        int[][] firstArray = new int[line][column];
        int[][] secondArray = new int[column][line];
        Random random = new Random();

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[0].length; j++) {
                firstArray[i][j] = random.nextInt(10);
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < secondArray.length; i++){
            for (int j = 0; j < secondArray[0].length; j++){
                secondArray[i][j] = firstArray[j][i];
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
