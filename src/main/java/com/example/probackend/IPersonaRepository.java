package com.example.probackend;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IPersonaRepository extends Repository<Persona, Integer> {
    public List<Persona> findAll();
    public Persona findById(int id);
    public Persona save(Persona p);
    public void delete(Persona p);
}
