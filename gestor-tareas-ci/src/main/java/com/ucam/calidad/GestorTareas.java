package com.ucam.calidad;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

    private final List<Tarea> tareas = new ArrayList<>();

    public void addTarea(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        tareas.add(new Tarea(nombre.trim()));
    }

    public void completarTarea(String nombre) {
        for (Tarea t : tareas) {
            if (t.getNombre().equals(nombre)) {
                t.completar();
                return;
            }
        }
    }

    public int contarPendientes() {
        int contador = 0;
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                contador++;
            }
        }
        return contador;
    }
}
