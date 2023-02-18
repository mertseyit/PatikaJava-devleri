import First.SayHello;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SayHello message = new SayHello("ahmet");
        message.printMessage();
    }
}