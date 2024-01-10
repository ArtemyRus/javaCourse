package lr7.example5;

public class SecondSubClass extends SuperClass{
    protected char symbol;

    SecondSubClass(String str, char symbol){
        super(str);
        this.symbol = symbol;
    }

    @Override
    public void printClassNameAndFieldValue() {
        System.out.println("Class Name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + getStr() + '\t' + symbol);
    }
}
