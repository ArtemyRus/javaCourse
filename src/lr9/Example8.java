package lr9;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        }catch (Exception ex){
            System.out.println(ex.toString());
        } finally {
            System.out.println("1");
        }
        return 2;
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
