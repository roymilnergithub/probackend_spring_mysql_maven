package com.example.probackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/personas")
public class Controlador {
    @Autowired
    IPersonaService service;

    @GetMapping("/listar")
    public List<Persona> listar()
    {
        return service.listar();
    }

    @PostMapping("/agregar")
    public Persona agregar(@RequestBody Persona p)
    {
        return service.add(p);
    }

    @GetMapping(path = {"/{id}"})
    public Persona listarId(@PathVariable("id") int id)
    {
        return service.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public Persona editar(@RequestBody Persona p, @PathVariable("id") int id)
    {
        p.setId(id);
        return service.edit(p);
    }

    @DeleteMapping(path = {"/{id}"})
    public Persona delete(@PathVariable("id") int id)
    {
        return service.delete(id);
    }

}
