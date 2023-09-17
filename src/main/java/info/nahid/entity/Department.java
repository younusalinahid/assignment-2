package info.nahid.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    private String id;
    private String name;
    private String description;
    private int year;
    private int studentNumber;

    public Department() {

    }
    public Department(String id, String name, String description,int year, int studentNumber) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.studentNumber = studentNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

}
