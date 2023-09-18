package info.nahid.service;

import info.nahid.entity.Student;
import info.nahid.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudent(String id) {
        Optional<Student> student = studentRepository.findById(id);
            return student.orElse(null);
    }

    public void updateStudent(String id, Student student) {
        studentRepository.save(student);
    }

}
