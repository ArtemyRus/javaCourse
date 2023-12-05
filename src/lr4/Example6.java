package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int line = 3, column = 5;
        int[][] firstArray = new int[line][column];
        int[][] secondArray = new int[line - 1][column - 1];
        Random random = new Random();
        int deleteColumn = random.nextInt(column);
        int deleteLine = random.nextInt(line);
        System.out.println();

        for (int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < firstArray[0].length; j++){
                firstArray[i][j] = random.nextInt(10);
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Delete column " + (deleteColumn + 1));
        System.out.println("Delete line " + (deleteLine + 1));
        System.out.println();

        for (int i = 0, k = 0; i < secondArray.length; i++, k++){
            if (i == deleteLine) k++;
            for (int j = 0, l = 0; j < secondArray[0].length; j++, l++){
                if (j == deleteColumn) l++;
                secondArray[i][j] = firstArray[k][l];
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
