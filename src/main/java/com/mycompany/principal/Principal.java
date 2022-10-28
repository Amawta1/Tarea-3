/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author amawt
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        var empresa = new Empresa("Empresa Electrica");
        var puesto = new Departamento("Gerencia", 9012, empresa);
        var empleado1 = new Empleado("2009", puesto, "Amawta Seraquive", 1999);
        puesto.setEmpresa(empresa);

        var empresa2 = new Empresa("Almacenes Eljuri");
        var puesto2 = new Departamento("Talento Humano", 3412, empresa2);
        var empleado2 = new Empleado("2010", puesto2, "Nixon Chuchuca", 1998);
        puesto2.setEmpresa(empresa2);
        
        System.out.println(empleado1.mostrarInfoEmpleado());
        System.out.println(empleado2.mostrarInfoEmpleado());
        
        
    }
}
