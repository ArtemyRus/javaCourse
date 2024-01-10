package lr7.example1;

public class SuperClass {
    private String strSuperClass;

    SuperClass(){
        strSuperClass = "";
    }

    SuperClass(String str){
        strSuperClass = str;
    }

    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + '\n' +
                "Variables: " + strSuperClass;
    }

    public String getStrSuperClass(){
        return strSuperClass;
    }
}
