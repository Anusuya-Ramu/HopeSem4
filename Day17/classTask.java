package Day17;
import java.util.*;

class Age implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age); // small to big
    }
}

class Marks implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.marks, s2.marks); // small to big
    }
}

class Mixed implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age) {
            return Double.compare(s2.marks, s1.marks); // marks descending
        }
        return Integer.compare(s1.age, s2.age); // age ascending
    }
}
class Student {
    int rollno;
    int age;
    double marks;

    Student(int rollno, int age, double marks) {
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }
}

public class classTask {
    public static void main(String[] args) {

        List<Student> l = new ArrayList<>();

        l.add(new Student(10, 20, 85.5));
        l.add(new Student(16, 21, 78.5));
        l.add(new Student(5, 22, 90.0));
        l.add(new Student(16, 19, 78.5));
        l.add(new Student(3, 21, 92.0));
        l.add(new Student(2, 20, 100.0));

       /*  Collections.sort(l, (x, y) -> {
            if (x.age == y.age) {
                return Double.compare(y.marks, x.marks); // marks descending
            }
            return Integer.compare(x.age, y.age); // age ascending
        });*/
        Collections.sort(l, new Mixed());
        System.out.println("Sort by Age and Marks:");
        for (Student s : l) {
            System.out.println(s.rollno + " " + s.age + " " + s.marks);
        }
    }
}
