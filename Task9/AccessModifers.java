package Task9;

// Base class
class Person {
    public String name;        // public
    protected int age;         // protected
    String city;               // default
    private String aadhaar;    // private

    // Constructor
    Person(String name, int age, String city, String aadhaar) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.aadhaar = aadhaar;
    }

    // Getter for private variable
    public String getAadhaar() {
        return aadhaar;
    }
}

// Level 1 Inheritance
class Employee extends Person {
    public int empId;

    Employee(String name, int age, String city, String aadhaar, int empId) {
        super(name, age, city, aadhaar);
        this.empId = empId;
    }
}

// Level 2 Inheritance
class Manager extends Employee {
    protected double salary;

    Manager(String name, int age, String city, String aadhaar, int empId, double salary) {
        super(name, age, city, aadhaar, empId);
        this.salary = salary;
    }
}

// Level 3 Inheritance
class SeniorManager extends Manager {
    private String department;

    SeniorManager(String name, int age, String city, String aadhaar,
                  int empId, double salary, String department) {
        super(name, age, city, aadhaar, empId, salary);
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);              // public
        System.out.println("Age: " + age);                // protected
        System.out.println("City: " + city);              // default
        System.out.println("Aadhaar: " + getAadhaar());   // private via getter
        System.out.println("Emp ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

// Main class
public class AccessModifers {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager(
                "Anu", 25, "Chennai", "1234-5678",
                101, 75000, "IT"
        );

        sm.displayDetails();
    }
}