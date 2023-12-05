package lr4;

public class Example1 {
    public static void main(String[] args) {
        int width = 23, height = 11;
        for (int i = 1; i <= height; i++){
            System.out.print(i + "\t\t");
            if (i == 1 || i == height) {
                for (int j = 1; j <= width; j++)
                    System.out.print("+");
                System.out.println();
                continue;
            }
            System.out.print("+");
            System.out.printf("%22s %n", "+");
        }
    }
}
