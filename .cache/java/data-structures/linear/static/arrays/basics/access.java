class Student {
    int number;
    String name;

    Student (int number, String name) {
        this.number = number;
        this.name = name;
    }
}
public class access {

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student(1, "Ayomide");
        students[1] = new Student(2, "Shalom");
        students[2] = new Student(3, "Victor");
        students[3] = new Student(4, "Folakemi");
        students[4] = new Student(5, "Timileyin");

        for (Student student : students) {
            System.out.println(student.number + ". " + student.name);
        }
    }
}