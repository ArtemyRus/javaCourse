package lr5.example3;

public class Main {
    public static void main(String[] args) {
        Dot firstDot = new Dot();
        Dot secondDot = new Dot(10,20);
        System.out.println(firstDot.x + " " + firstDot.y);
        System.out.println(secondDot.x + " " + secondDot.y);
    }
}
