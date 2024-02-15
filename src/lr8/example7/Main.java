package lr8.example7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex Helpers", 22);

        try(FileOutputStream fileOutputStream =
                    new FileOutputStream("src/lr8/example7/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOutputStream)){
            out.writeObject(person);
            System.out.println("Serialized data is saved in person.json");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
