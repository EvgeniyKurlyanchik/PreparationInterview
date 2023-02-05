package com.example.task5;


public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student student1 = new Student("Student1",5);
        Student student2 = new Student("Student2",5);
        Student student3 = new Student("Student3",4);
        Student student4 = new Student("Student4",3);
        studentService.saveStudent(student1);
        studentService.saveStudent(student2);
        studentService.saveStudent(student3);
        studentService.saveStudent(student4);

        System.out.println( studentService.findStudent(3));

        System.out.println(studentService.findAllStudents());
        studentService.deleteStudent(1L);
        studentService.updateStudent();
        System.out.println( studentService.findStudent(1));

}
}
