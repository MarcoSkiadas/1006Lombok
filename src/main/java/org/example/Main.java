package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(2,"Test","Baum",1);
        Student student2 = new Student(1,"Helga","Strauch",2);
        Student student3 = new Student(3,"Test","Baum",4);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Teacher teacher1 = new Teacher("13","Hans","Math");
        Teacher teacher2 = new Teacher("12","Mani","Java");

        Course course1 = new Course(11,"Math",teacher1,"R",students);
        Course course2 = new Course(12,"Java",teacher2,"S",students);

        System.out.println(student1.getId());
        System.out.println(student1.getAddress());
        System.out.println(student1.getName());
        System.out.println(student1.getGrade());

        Course course3 = Course.builder()
                .id(23)
                .name("Math")
                .teacher(teacher2)
                .build();

        System.out.println(course3.getId());

        Teacher teacher3 = Teacher.builder()
                .id("33")
                .name("Jürgen")
                .subject("English")
                .build();

        System.out.println(teacher3.id());

        teacher3 = teacher3.withId("44");

        System.out.println(teacher3.id());

        UniversityService universityService = new UniversityService();
        System.out.println();
        System.out.println(universityService.averageGradeByCourse(course1));


    }
}