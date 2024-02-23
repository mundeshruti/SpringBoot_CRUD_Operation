package SPRINGBOOT.CRUD.crud.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SPRINGBOOT.CRUD.crud.operation.DAO.Studentrepository;
import SPRINGBOOT.CRUD.crud.operation.entity.Student;

@Service
public class Studentservice {
    @Autowired
    private Studentrepository studentRepository;
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            return studentRepository.save(student);
        }
        return null;
    }
    
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
