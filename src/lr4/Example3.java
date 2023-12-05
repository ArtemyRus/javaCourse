package lr4;


public class Example3 {
    public static void main(String[] args) {
        int width = 10, height = 20;
        int[][] intArray = new int[width][height];
        for (int i = 0; i < width; i++){
            System.out.print((i + 1) + "\t\t");
            for (int j = 0; j < height; j++) {
                intArray[i][j] = 2;
                System.out.print(intArray[i][j]);
            }
            System.out.println();
        }
    }
}
