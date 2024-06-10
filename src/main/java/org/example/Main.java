package org.example;

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

    }
}