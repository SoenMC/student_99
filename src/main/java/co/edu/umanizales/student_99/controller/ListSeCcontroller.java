package co.edu.umanizales.student_99.controller;


import co.edu.umanizales.student_99.model.AvgFleas;
import co.edu.umanizales.student_99.model.Node;
import co.edu.umanizales.student_99.model.Pet;
import co.edu.umanizales.student_99.service.ListSeCservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "listsec")
public class ListSeCcontroller {

    @Autowired
    private ListSeCservice listSeCservice;

    @GetMapping
    public Node getAllLinked()
    {
        return listSeCservice.getAllLinked();
    }  //enlazar lista

    @PostMapping(path = "/tostart")
    public String addToStart(@RequestBody Pet pet)  //agregar mascota al inicio
    {
        return listSeCservice.addToStart(pet);
    }
    @PostMapping(path = "/toend")
    public String addToEnd(@RequestBody Pet pet)    //agregar al final
    {
        return listSeCservice.addToEnd(pet);
    }
    @GetMapping(path = "/fleas")       //promedio de pulgas para hembras y machos
    public AvgFleas cantFlea()
    {
        return listSeCservice.cantFlea();
    }

}
