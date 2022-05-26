package co.edu.umanizales.student_99.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {
    private String id;
    private String name;
    private String City;
    private char gender;
    private double salary;
    private boolean job;
    private String phone;
    private static String UNIVERSITY;





}
