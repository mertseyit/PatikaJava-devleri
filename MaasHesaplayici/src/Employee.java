public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxtPart;
    int bonusPart;
    double totalSalary;
    int thisYear;
    double increase;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonusPart = 0;
        this.taxtPart = 0;
        this.totalSalary = salary;
        this.thisYear = 2023;
        this.increase = 0;
    }

    public void taxt() {
        if(this.salary >= 1000) {
            this.taxtPart = (this.salary * 0.03);
            this.totalSalary = this.salary - this.taxtPart;
        }
    }

    public void bonus() {
        if(this.workHours > 40) {
            this.bonusPart = (this.workHours - 40) * 30;
            this.totalSalary += this.bonusPart;
        }
    }

    public void raiseSalary() {
        if((this.thisYear - this.workHours < 10)) {
            this.increase = (this.salary * 0.05);
        }
        else if((this.thisYear - this.workHours > 9) && (this.thisYear - this.workHours < 20)) {
            this.increase = (this.salary * 0.1);
        }
        else if((this.thisYear - this.workHours > 19)) {
            this.increase = (this.salary * 0.15);
        }
    }

    public void printInfı() {
        this.bonus();
        this.taxt();
        this.raiseSalary();
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Taxt: " + this.taxtPart);
        System.out.println("Bonus: " + this.bonusPart);
        System.out.println("Salary increase: " + this.increase);
        System.out.println("Total Salary: " + (this.totalSalary + this.increase));
    }
}
