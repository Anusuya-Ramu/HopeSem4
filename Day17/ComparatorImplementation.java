package Day17;

import java.util.*;

class Student {
    int rollno;
    int age;
    double marks;

    Student(int rollno, int age, double marks) {
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return rollno + " " + age + " " + marks;
    }
}
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age); // small to big
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.marks, s2.marks); // small to big
    }
}
class RollnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno); // small to big
    }
}

public class ComparatorImplementation {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student(10, 20, 85.5));
        l.add(new Student(16, 15, 21.5));
        l.add(new Student(5, 22, 90.0));
        l.add(new Student(16, 19, 78.5));
        l.add(new Student(3, 5, 92.0));
        l.add(new Student(2, 5, 100.0));
        System.out.println("Sort by Age:");
        Collections.sort(l, new AgeComparator());
        for (Student s : l) {
            System.out.println(s);
        }
        System.out.println("\nSort by Marks:");
        Collections.sort(l, new MarksComparator());
        for (Student s : l) {
            System.out.println(s);
        }
        System.out.println("\nSort by Roll No:");
        Collections.sort(l, new RollnoComparator());
        for (Student s : l) {
            System.out.println(s);
        }
    }
}
  
