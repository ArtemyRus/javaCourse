package lr4;

public class Example7 {
    public static void main(String[] args) {
        int line = 6, column = 8, j, count = 1;
        int[][] arr = new int[line][column];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                j = 0;
                while (j < arr[0].length ) {
                    arr[i][j] = count++;
                    j++;
                }
            } else {
                j = arr[0].length - 1;
                while (j >= 0) {
                    arr[i][j] = count++;
                    j--;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
