package co.edu.umanizales.student_99.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityCount {
    private String cityProcedence;
    private int countJob;
    private int countNotJob;
}
