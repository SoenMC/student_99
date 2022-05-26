package co.edu.umanizales.student_99.controller;

import co.edu.umanizales.student_99.model.Student;
import co.edu.umanizales.student_99.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping(path = "Student")
public class StudentController {

    @Autowired
    private StudentService studentService;     //es el servicio


    @GetMapping()
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/percentage/{gender}")
    public float getPercentageByGender(@PathVariable char gender) {
        return studentService.getPercentageByGender(gender);

    }

    @GetMapping(path = "/studentwork")
    public List<Student> getStudentWork() {
        return studentService.getStudentsWork();
    }

    @GetMapping(path = "/studentsworkbysalary/{gender}/{salary}")
    public List<Student> getStudentsWorkBySalary
            (@PathVariable char gender, @PathVariable double salary) {
        return studentService.getStudentsWorkBySalary(gender, salary);
    }

    @GetMapping(path = "/maysalary")
    public List<Student> getMatSalary() {
        return studentService.getMaySalary();
    }

}
