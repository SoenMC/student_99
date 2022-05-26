package co.edu.umanizales.student_99.service;

import co.edu.umanizales.student_99.model.AvgFleas;
import co.edu.umanizales.student_99.model.ListSeC;
import co.edu.umanizales.student_99.model.Node;
import co.edu.umanizales.student_99.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class ListSeCservice {

    private ListSeC list1 = new ListSeC();

    public Node getAllLinked()
    {
        return this.list1.enlist();
    }
    public String addToStart(Pet pet)
    {
        this.list1.addToStart(pet);
        return "Adicionado con exito al inicio de la lista";
    }
    public String addToEnd(Pet pet)
    {
        this.list1.addToEnd(pet);
        return "Adicionado con exito al final de la lista";
    }
    public AvgFleas cantFlea()
    {
        return this.list1.cantFlea();
    }

}
