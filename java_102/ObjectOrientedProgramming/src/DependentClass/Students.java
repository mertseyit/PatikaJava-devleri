package DependentClass;

public class Students extends Person {
    private int matNote;
    private int phsNote;
    private int bioNot;

    public Students(String name, String surname, String number, String career, int matNote, int phsNote, int bioNot) {
        super(name, surname, number, career);
        this.bioNot = bioNot;
        this.matNote = matNote;
        this.phsNote = phsNote;
    }

    public int getMatNote() {
        return matNote;
    }

    public void setMatNote(int matNote) {
        this.matNote = matNote;
    }

    public int getPhsNote() {
        return phsNote;
    }

    public void setPhsNote(int phsNote) {
        this.phsNote = phsNote;
    }

    public int getBioNot() {
        return bioNot;
    }

    public void setBioNot(int bioNot) {
        this.bioNot = bioNot;
    }
}
