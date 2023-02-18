package DependentClass;

public class Person {
    private String name;
    private String surname;
    private String number;
    private String career;

    public Person(String name, String surname, String number, String career) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.career = career;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCareer() {
        return this.career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
