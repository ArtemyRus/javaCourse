package lr4;


import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();

        System.out.println("Введите ключ:");
        int key = in.nextInt();

        char[] encryptedText = text.toCharArray();
        for (int i = 0; i < encryptedText.length; i++){
            if(Character.isLetterOrDigit(encryptedText[i]))
                encryptedText[i] += (char) key;
        }

        System.out.println("Строка после преобразования: ");
        for (char ch : encryptedText) {
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();
        while (!answer.equals("y") & !answer.equals("n")){
            System.out.println("Введите корректный ответ.");
            answer = in.nextLine();
        }
        if (answer.equals("y"))
            System.out.println(text);
        else
            System.out.println("До свидания!");

        in.close();
    }
}
