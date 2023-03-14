package com.example.probackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository repository;

    @Override
    public List<Persona> listar() {
        return repository.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Persona add(Persona p) {
        return repository.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return repository.save(p);
    }

    @Override
    public Persona delete(int id) {
        Persona p = repository.findById(id);
        if(p != null)
            repository.delete(p);
        return p;
    }
}
