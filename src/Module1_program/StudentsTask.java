
import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int rollNo;
    int age;
    double marks;


    public Student(String name, int rollNo, int age, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "[" + rollNo + ", " + name + ", Age: " + age +",Marks:"+marks+"]" ;
    }
}

public class StudentsTask {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aarav", 1, 15, 88.5));
        students.add(new Student("Vivaan", 2, 14, 91.0));
        students.add(new Student("Aditya", 3, 16, 76.5));

        students.sort(Comparator.comparingInt(s -> s.age));

        System.out.println(students);
        students.sort(Comparator.comparingDouble(s -> s.marks));
        System.out.println(students);
    }
}
