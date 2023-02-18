package OverrideAndOverload;

public class Bird extends Animal {
    public Bird(String name, int legs) {
        super(name,legs);
    }

    @Override
    public void activity() {
        System.out.println("I can walk and fly");
    }
    @Override
    public String features() {
        return ("My name is " + this.getName() + " and I have " + this.getLegs() + " legs. Miyav");
    }
}
