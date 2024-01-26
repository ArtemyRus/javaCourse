package lr9.example16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = 5, column = 7;
        Matrix matrix = new Matrix(row, column);
        matrix.printMatrix();
        System.out.print("Введите номер столбца: ");
        try{
            int inputColumn = in.nextInt();
            if(inputColumn < 1 || inputColumn > column)
                throw new Exception();
            matrix.printColumn(inputColumn);
        } catch (NumberFormatException ex){
            System.out.println("Введено не число");
        } catch (Exception ex){
            System.out.println("Столбец с таким номером не существует");
        }
    }
}
