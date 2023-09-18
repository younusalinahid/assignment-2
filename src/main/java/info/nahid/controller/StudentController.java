package info.nahid.controller;

import info.nahid.entity.Student;
import info.nahid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @PostMapping(value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }

    @PutMapping(value = "students/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable String id) {
        studentService.updateStudent(id,student);
        return "Successfully Update";
    }

    @DeleteMapping(value = "students/{id}")
    public String deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return "Successfully Delete";
    }
}
