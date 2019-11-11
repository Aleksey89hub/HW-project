package HW2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, String surname, String dateOfBirth, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCourse() {
        return course;
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Vasya", "Malye", "12.02.1990", 2);
        students.add(student1);
        Student student2 = new Student("Vasya1", "Malye1", "12.02.1989", 2);
        students.add(student2);
        Student student3 = new Student("Petya", "Popolamov", "12.02.1999", 3);
        students.add(student3);
        Student student4 = new Student("Masha", "Folitar", "12.02.1996", 4);
        students.add(student4);

       Student manager = student1;
       manager.printstudent(students,2);
    }

        public void printstudent(List<Student>students,int course){
        for(Student student:students){
            if(student.course==course){
                System.out.println(student);
            }

        }

    }
}
