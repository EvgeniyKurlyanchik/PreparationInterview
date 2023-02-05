package com.example.task5;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public StudentService() {
    }

    public Student findStudent(int id) {
        return studentDao.findById(id);
    }

    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    public void deleteStudent(Long id) {
        studentDao.delete(id);
    }

    public void updateStudent() {
        studentDao.update();
    }

    public List<Student> findAllStudents() {
        return studentDao.findAll();
    }


}
