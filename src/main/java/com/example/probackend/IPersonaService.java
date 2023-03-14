package com.example.probackend;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> listar();
    public Persona listarId(int id);
    public Persona add(Persona p);
    public Persona edit(Persona p);
    public Persona delete(int id);
}
