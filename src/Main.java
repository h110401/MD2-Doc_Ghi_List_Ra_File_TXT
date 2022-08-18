import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Duc Ga 1", 19));
        studentList.add(new Student("Duc Ga 5", 19));
        studentList.add(new Student("Duc Ga 5", 20));
        studentList.add(new Student("Duc Ga 5", 18));
        studentList.add(new Student("Duc Ga 4", 19));
        studentList.add(new Student("Duc Ga 3", 19));
        studentList.add(new Student("Duc Ga 2", 19));
        studentList.add(new Student("Hung", 18));


        Collections.sort(studentList);

        // Sap xep list bang cach dung comparable
        System.out.println("COMPARABLEEEEEEEEEEEEEEEE");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Show list

        System.out.println();
        System.out.println();

        // Clone student list
        List<Student> studentList2 = new ArrayList<>(studentList);

        CompareStudentByAge compareAge = new CompareStudentByAge();

        CompareStudentById compareId = new CompareStudentById();

        // Sap xep list bang cach dung comparator

        Collections.sort(studentList2, compareAge);

        System.out.println("COMPARATORRRRRRRRRRRRRRRRRRRR");
        for (Student student : studentList2) {
            System.out.println(student);
        }

    }
}
