package lr6.example4;

public class Factorial {
    static int doubleFactorial(int n){
        if (n == 2)
            return 2;
        else if (n == 1)
            return 1;
        else
            return n * doubleFactorial(n-2);
    }
}
