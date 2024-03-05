package lr11.example2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        bin(n);
        System.out.println();
        System.out.println(Integer.toBinaryString(n));
    }

    public static void bin(int x){
        StringBuilder sb = new StringBuilder();
        if(x % 2 == 0)
            sb.append(0);
        else sb.append(1);
        if(x > 1)
            bin(x / 2);
        sb.reverse();
        System.out.print(sb);
    }
}
