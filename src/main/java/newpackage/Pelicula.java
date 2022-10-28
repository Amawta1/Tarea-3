/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author amawt
 */
public class Pelicula {
    private String nombrePelicula;
    private int yearEstreno;
    private double duracion;

    public Pelicula(String a, int b,double c) {
        this.nombrePelicula = a;
        this.yearEstreno = b;
        this.duracion = c;

    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getYearEstreno() {
        return yearEstreno;
    }

    public void setYearEstreno(int yearEstreno) {
        this.yearEstreno = yearEstreno;
    }


    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String mostrarInfo() {
        return "Esta pelicula se estreno en el año " + this.getYearEstreno()
                + " y su duracion es de " + this.duracion + " horas";

    }
    
}
