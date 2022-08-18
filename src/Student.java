public class Student implements Comparable<Student> {

    public int id;

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if(this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        } else {
            return this.age - o.age;
        }
    }
}
