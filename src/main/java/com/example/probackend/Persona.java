package com.example.probackend;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String telefono;

    //    public Persona() {
    //    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
