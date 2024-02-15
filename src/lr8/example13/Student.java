package lr8.example13;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstName;
    private String secondName;
    private String studyGroup;

    public Student(String fName, String sName, String group){
        firstName = fName;
        secondName = sName;
        studyGroup = group;
    }

    public String toString(){
        return "First name: " + firstName + '\n' +
                "Second name: " + secondName + '\n' +
                "Group: " + studyGroup;
    }
}
