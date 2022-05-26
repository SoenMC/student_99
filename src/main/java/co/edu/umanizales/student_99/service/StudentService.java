package co.edu.umanizales.student_99.service;


import co.edu.umanizales.student_99.model.CityCount;
import co.edu.umanizales.student_99.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService<MaySalary> {
    private List<Student> students;    // un atributo de la clase
    private int countJob;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student("1002652860", "Sergio", "Manizales",
                'M', 30000, true,"123123132"));
        students.add(new Student("1002652860", "Sergio", "Manizales",
                'M', 541000,true,"1456526"));
        students.add(new Student("1002652860", "Sergio", "Manizales",
                'M', 200000, true,"21321231"));
    }

    public List<Student> getCantStudentsJob()
    {
        return students;
    }



    public List<Student> getAllStudents()
    {
        return students;
    }

    public float getPercentageByGender(char gender) {
        int count = 0;
        for (Student student : students)    //for students in students
        {
            if (student.getGender() == gender) {
                count++;
            }
        }
        return count / (float) students.size();
    }

    public List<Student> getStudentsWork() {
        List<Student> studentsWork = new ArrayList<>();
        for (Student student : students) {
            if (student.isJob() == true && student.getSalary() > 1000000) {
                studentsWork.add(student);
            }
        }
        return studentsWork;
    }

    public List<Student> getStudentsWorkBySalary(char gender, double salary)
    {
        List<Student> studentsWork = new ArrayList<>();
        for (Student student : students)
        {
            if (student.isJob() == true && student.getGender() == gender && student.getSalary() >= salary)
            {
                studentsWork.add(student);
            }
        }
        return studentsWork;
    }
    public List<Student> getMaySalary() {
        List<Student> MaySalary = new ArrayList<>();

        Student M_Student = null;
        Student F_Student = null;

        for(Student student:students){
            if(student.isJob()){
                if((student.getGender() =='M' && M_Student == null)
                    || (student.getGender() == 'M' && student.getSalary() > M_Student.getSalary()) )
                {
                    M_Student=student;
                }
                if((student.getGender() =='F' && F_Student == null)
                    || (student.getGender() == 'F' && student.getSalary() > F_Student.getSalary()) )
                {
                    F_Student=student;
                }
            }
        }
        if(M_Student !=null){
            MaySalary.add(M_Student);

        }
        if(F_Student !=null){
            MaySalary.add(F_Student);
        }
        return MaySalary;


    }





}