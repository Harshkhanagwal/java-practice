
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Intern extends Employee {
    double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Harsh", 50000);
        Employee e2 = new PartTimeEmployee("Ravi", 5, 200);
        Employee e3 = new Intern("Aman", 10000);

        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            System.out.println(e.name + " Salary: " + e.calculateSalary());
        }
    }
}