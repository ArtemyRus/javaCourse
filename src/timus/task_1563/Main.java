package timus.task_1563;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1563/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            int n = Integer.parseInt(bufferedReader.readLine());
            ArrayList<String> list = new ArrayList<String>();
            int sum = 0;
            for (int i = 0; i < n; i++){
                String str = bufferedReader.readLine();
                if(list.contains(str))
                    sum++;
                else list.add(str);
            }
            System.out.println(sum);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}