package timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int garryTargets = Integer.parseInt(input[0]);
        int larryTargets = Integer.parseInt(input[1]);
        int sum = larryTargets + garryTargets - 1;
        int garryMisses = sum - garryTargets;
        int larryMisses = sum - larryTargets;
        System.out.println(garryMisses + " " + larryMisses);
        in.close();
    }
}
