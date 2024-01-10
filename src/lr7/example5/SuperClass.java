package lr7.example5;

public class SuperClass {
    private final String str;

    SuperClass(String str){
        this.str = str;
    }

    public void printClassNameAndFieldValue(){
        System.out.println("Class Name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + str);
    }

    public String getStr() {
        return str;
    }
}
