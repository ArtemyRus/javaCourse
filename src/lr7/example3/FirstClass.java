package lr7.example3;

public class FirstClass {
    public int value;

    FirstClass(){}

    FirstClass(int value){
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }


    public String toString(){
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + value;
    }
}
