package OverrideAndOverload;

public class Bird extends Animal {
    public Bird(String name, int legs) {
        super(name,legs);
    }

    @Override
    public void activity() {
        System.out.println("I can walk and fly");
    }
}
