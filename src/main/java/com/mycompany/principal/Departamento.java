/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author amawt
 */
public class Departamento {
    
    private String nombreDepartamento;
    Empresa empresa;

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }


    public String getNombreDepartamento() {
        return nombreDepartamento;
    }


    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Departamento(String nombreDepartamento, int codigoDepartamento, Empresa empresa) {
        this.nombreDepartamento = nombreDepartamento;
        this.empresa = empresa;
    }
   
    
}
