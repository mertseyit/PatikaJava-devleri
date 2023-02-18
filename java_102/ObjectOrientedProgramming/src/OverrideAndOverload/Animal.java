package OverrideAndOverload;

public class Animal {
   private String name;
   private int legs;

    public Animal(String name, int legs) {
        if(legs<0) {
            legs = 0;
        }
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if(legs<0) {
            legs = 0;
        }
        this.legs = legs;
    }

    public void activity() {
        System.out.println("I can walk and run");
    }

    public void activity(String extras) {
        System.out.println("I can walk and run. Also " + extras);
    }

    public String features() {
        return ("My name is " + this.getName() + " and I have " + this.getLegs() + " legs");
    }

    public static void getFeatures(Animal[] animals) {
        for (Animal animal: animals) {
            System.out.println(animal.features());
        }
    }
}
