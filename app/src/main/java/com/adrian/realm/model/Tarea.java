package com.adrian.realm.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Tarea extends RealmObject {
    @PrimaryKey()
    public int id;

    public String descripcion;
    public String fecha;
    public int prioridadId;

    public Tarea(String descripcion, String fecha, int prioridadId) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridadId = prioridadId;
    }
    public Tarea(){

    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPrioridadId() {
        return prioridadId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrioridadId(int prioridadId) {
        this.prioridadId = prioridadId;
    }
}
