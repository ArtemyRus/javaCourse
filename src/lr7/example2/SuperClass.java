package lr7.example2;

public class SuperClass {
    private String str;

    SuperClass(String str){
        this.str = str;
    }

    SuperClass(){}


    public void setValue(String str) {
        this.str = str;
    }

    public int getStringLength(){
        return str.length();
    }
}
