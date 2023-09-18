package info.nahid.controller;
import info.nahid.entity.Department;
import info.nahid.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @PostMapping(value = "/departments")
    public String addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
        return "Successfully Save";
    }

    @GetMapping("departments/{id}")
    public Department getDepartment(@PathVariable String id) {
        return departmentService.getDepartment(id);
    }

    @PutMapping(value = "departments/{id}")
    public String updateDepartment(@RequestBody Department department, @PathVariable String id) {
        departmentService.updateDepartment(id, department);
        return "Successfully Update";
    }

}
