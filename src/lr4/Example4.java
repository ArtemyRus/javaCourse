package lr4;


public class Example4 {
    public static void main(String[] args) {
        int side = 17;
        int[][] intArray = new int[side][side];
        for (int i = 0; i < intArray.length; i++)
            for (int j = 0; j < intArray[0].length; j++)
                intArray[i][j] = 2;
        for (int i = 0; i < side; i++){
            System.out.print((i+1) + "\t\t");
            for (int j = 0; j <= i; j++)
                System.out.print(intArray[i][j]);
            System.out.println();
        }
    }
}
