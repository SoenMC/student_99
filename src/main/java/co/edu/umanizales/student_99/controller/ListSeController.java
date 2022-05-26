package co.edu.umanizales.student_99.controller;


import co.edu.umanizales.student_99.model.Node;
import co.edu.umanizales.student_99.model.Pet;
import co.edu.umanizales.student_99.service.ListSeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "listse")
public class ListSeController {

    @Autowired
    private ListSeService listSeService;

    @GetMapping //leer datos
    public Node getAllLinked()
    {
        return listSeService.getAllLinked();
    }

    @PostMapping(path = "/tostart")  //pedir datos
    public String addToStart(@RequestBody Pet pet){

        return listSeService.addToStart(pet);
    }
    @PostMapping(path="/toposition/{position}")
    public String createPetToPosition(@PathVariable int position,
                                      @RequestBody Pet pet){
        return listSeService.addToPosition(position,pet);
    }
    @PostMapping(path = "/deletebyposition/{position}")
    public String deleteByPosition(@PathVariable int position)
    {
        return listSeService.deleteToPosition(position);
    }

    @GetMapping(path = "/invert")
    public String invert()
    {
        return listSeService.invert();
    }

    @PostMapping(path = "/loadpets")
    public String loadPet(@RequestBody List<Pet> pets)
    {
        return "Mascotas cargadas ";
    }




}
