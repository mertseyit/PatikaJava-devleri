package DependentClass;

public class Calculate {
    public double getAverage(Students students) {
        return ( (double) students.getBioNot() + (double) students.getMatNote() + (double) students.getPhsNote() ) / 3;
    }
}
