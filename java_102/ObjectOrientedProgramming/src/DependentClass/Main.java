package DependentClass;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Mert", "Yılmaz", "2118","Student", 100,90,73);
        Calculate c1 = new Calculate();
        Students s2 = new Students("Seyit", "Yılmaz", "2118","Student", 90,90,100);
        System.out.println(c1.getAverage(s1));
        System.out.println(c1.getAverage(s2));
        System.out.println(s1.getName());

    }
}
