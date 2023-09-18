package info.nahid.service;

import info.nahid.entity.Department;
import info.nahid.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public Department getDepartment(String id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }

    public void updateDepartment(String id,Department department) {
        departmentRepository.save(department);
    }

}
