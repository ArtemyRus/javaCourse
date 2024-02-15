package lr8.example13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("src/lr8/example13/student.json"))){
            Student student = new Student("Artemy", "Rusinov", "РИЗ-220916у");
            oos.writeObject(student);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
            return;
        }

        try(ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("src/lr8/example13/student.json"))){
            Student student = (Student)ois.readObject();
            System.out.println(student);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
