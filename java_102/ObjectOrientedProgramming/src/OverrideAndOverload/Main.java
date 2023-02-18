package OverrideAndOverload;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("max",4);
        dog1.activity();
        Bird bird1 = new Bird("civciv", 2);
        bird1.activity();
        Monkey monkey1 = new Monkey("şebek",2);
        monkey1.activity("I can jump from one branch to another");
    }
}
