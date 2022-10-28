/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author amawt
 */
public class Persona {
    
    private String nombrePersona;
    private int fechaNacimiento;

    public String mostrarInfo() {
        return " El nombre del empleado es " + this.nombrePersona + " nació en el año " + this.fechaNacimiento;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public Persona(String nombre, int fechaNacimiento) {
        this.nombrePersona = nombrePersona;
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
