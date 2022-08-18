import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  Lưu list vào file txt

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Duc Ga 1", 19));
        studentList.add(new Student(2, "Duc Ga 4", 19));
        studentList.add(new Student(4, "Duc Ga 2", 19));
        studentList.add(new Student(10, "Hung", 18));

        try {
            FileOutputStream fos = new FileOutputStream("src/data/studentList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(studentList);

            fos.close();
            oos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //  Lấy list từ file txt

        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/data/studentList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            students = (List<Student>) ois.readObject();

            fis.close();
            ois.close();

        } catch (IOException e) {   // IOException  ngoại lệ khi đọc ghi file
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Show list
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
