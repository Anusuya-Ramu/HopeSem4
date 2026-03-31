package task8;

class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Full-time Employee
class FullTime extends Employee {
    double monthlySalary;

    FullTime(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calSalary() {
        return monthlySalary;
    }
}

// Part-time Employee
class PartTime extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTime(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        FullTime ft = new FullTime("John", 1, 5000);
        PartTime pt = new PartTime("Jane", 2, 20, 80);

        System.out.println("Full-time Employee Salary: $" + ft.calSalary());
        System.out.println("Part-time Employee Salary: $" + pt.calSalary());
    }
}