/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author amawt
 */
public class Empleado extends Persona {
    
    private String añoIngreso;
    private Departamento puesto;

    public void setAñoIngreso(String añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getAñoIngreso() {
        return añoIngreso;
    }

    public void setPuesto(Departamento puesto) {
        this.puesto = puesto;
    }

    public Departamento getPuesto() {
        return puesto;
    }

    public String mostrarInfoEmpleado() {
        return this.mostrarInfo() + ", trabaja en el cargo de  " + this.puesto.getNombreDepartamento()
                + "  y pertenece a la empresa: " + this.puesto.empresa.getNombre()+ 
                " y esta en la empresa desde el año: " + this.getAñoIngreso();

    }

    public Empleado(String añoIngreso, Departamento puesto, String nombrePersona, int fechaNacimiento) {
        super(nombrePersona, fechaNacimiento);
        this.añoIngreso = añoIngreso;
        this.puesto = puesto;
    }
}
