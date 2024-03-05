package lr11.example1;

public class Recursion {
    private static int step = 0;
    public static void ex1(int x){
        System.out.println("x = " + x);
        if((2 * x + 1) < 20) {
            ex1(2 * x + 1);
        }
    }

    public static void ex2(int x){
        if((2 * x + 1) < 20) {
            ex2(2 * x + 1);
        }
        System.out.println("x = " + x);
    }

    public static void ex3(int x){
        space();
        System.out.println("" + x + "-> ");
        step++;
        if((2 * x + 1) < 20){
            ex3(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }

    public static int ex4(int n){
        int result;
        if (n == 1) return 1;
        result = ex4(n - 1) * n;
        return result;
    }

    public static int ex5(int n){
        if(n == 0){
            System.out.print("fib(" + 0 + ")");
            System.out.println();
            return 0;
        }
        if (n == 1){
            System.out.print("fib(" + 1 + ")");
            System.out.println();
            return 1;
        }
        System.out.print("fib(" + n + ") -> ");
        return ex5(n - 2) + ex5(n - 1);
    }

    private static void space(){
        for (int i = 0; i < step; i++){
            System.out.print(" ");
        }
    }
}
