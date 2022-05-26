package co.edu.umanizales.student_99.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    private String name;
    private int  id;
    private byte age;
    private String breed;
    private char gender;
    private int flea;

}
