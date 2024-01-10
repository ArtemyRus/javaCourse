package lr7.example1;

public class SubClass extends SuperClass{
    private String strSubClass;

    SubClass(){
        super();
        strSubClass = "";
    }

    SubClass(String str){
        super(str);
        strSubClass = str;
    }

    SubClass(String str1, String str2){
        super(str1);
        strSubClass = str2;
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + getStrSuperClass() + '\t' + strSubClass;
    }
}
