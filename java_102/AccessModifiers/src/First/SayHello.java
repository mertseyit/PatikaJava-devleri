package First;

public class SayHello {
    static int counter = 0;
    private String name;
    protected String pacgakeName;
    public SayHello(String name) {
        this.name = name;
        this.pacgakeName = "First";
    }

    public void printMessage() {
        System.out.println("hello " + name);
    }
}
