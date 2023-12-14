package lr6.example5;

public class SumOfSquares {
    static int naturalNumbers(int n){
        if (n == 1) return 1;
        return (int)Math.pow(n, 2) + naturalNumbers(n - 1);
    }
}
