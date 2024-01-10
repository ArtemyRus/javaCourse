package lr7.example2;

public class SubClass extends SuperClass{
    public int value;

    SubClass(String str, int value) {
        super(str);
        this.value = value;
    }

    SubClass(){}

    public void setValue(){
        value = 0;
        super.setValue("");
    }

    public void setValue(int value){
        this.value = value;
        super.setValue("");
    }


    public void setValue(String str){
        value = 0;
        super.setValue(str);
    }

    public void setValue(int value, String str){
        this.value = value;
        super.setValue(str);
    }

}
