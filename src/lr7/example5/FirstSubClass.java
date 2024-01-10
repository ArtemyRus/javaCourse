package lr7.example5;

public class FirstSubClass extends SuperClass{
    protected int value;

    FirstSubClass(String str, int value){
        super(str);
        this.value = value;
    }

    @Override
    public void printClassNameAndFieldValue() {
        System.out.println("Class Name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + getStr() + '\t' + value);
    }
}
