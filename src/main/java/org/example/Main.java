package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("test-id1", "Max", "Stuttgart", "B");
        System.out.println("-------------------student empty and student filled------------");
        System.out.println("Student1: " + student);
        System.out.println("Student2: " + student2);

        System.out.println("-------------------student SETTER------------");
        student.setId("test-id2");
        student.setName("Mathilde");
        System.out.println("Student1: " + student);

        Teacher teacher1 = new Teacher("test-id54", "Harald", "Java");
        Teacher teacher2 = new Teacher("test-id89", "Siglinde", "Javascript");
        System.out.println("-------------------teachers------------");
        System.out.println("Teacher1: " + teacher1);
        System.out.println("Teacher2: " + teacher2);

        System.out.println("-------------------teacher wither------------");
        Teacher teacher3 = teacher2.withId("test-id634");
        System.out.println("Teacher3: " + teacher3);

        //Course javaCourseEmpty = new Course(); => not running since using of @Value
        Course javaCourseFilled = new Course("test-course-id-2", "Java", teacher1, new HashMap<String, Student>() {{
            put(student.getId(), student);
            put(student2.getId(), student2);
        }});
        Course javaCourseBuilder = Course.builder()
                .id("course-id-1")
                .name("Java")
                .teacher(teacher1)
                .students(new HashMap<>() {{
                    put(student.getId(), student);
                    put(student2.getId(), student2);
                    put("test-id3874", new Student());
                }})
                .build();
        System.out.println("-------------------java course with builder------------");
        System.out.println("JavaCourseBuilder: " + javaCourseBuilder);
        System.out.println("-------------------java course without builder------------");
        //System.out.println("Empty course: " + javaCourseEmpty);
        System.out.println("Filled course: " + javaCourseFilled);

    }
}