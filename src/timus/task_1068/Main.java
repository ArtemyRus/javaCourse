package timus.task_1068;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1068/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            int n = Integer.parseInt(bufferedReader.readLine());
            int sum = 0;
            if (n < 1)
                for (int i = 1; i >= n; i--)
                    sum += i;
            else for (int i = 1; i <= n; i++)
                    sum += i;
            System.out.println(sum);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
