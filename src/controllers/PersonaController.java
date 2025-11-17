package controllers;

import models.Persona;

public class PersonaController {

    public Persona findByName(Persona[] personas, String nombre) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
