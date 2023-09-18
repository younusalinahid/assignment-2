package info.nahid.controller;

import info.nahid.entity.Student;
import info.nahid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
}
