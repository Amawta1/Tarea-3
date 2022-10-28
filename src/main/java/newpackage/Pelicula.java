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
    private String pelicula;
    private int yearLanzamiento;
    private double duracion;

    public Pelicula(String a, int b,double c) {
        this.pelicula = a;
        this.yearLanzamiento = b;
        this.duracion = c;

    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getYearLanzamiento() {
        return yearLanzamiento;
    }

    public void setYearLanzamiento(int yearLanzamiento) {
        this.yearLanzamiento = yearLanzamiento;
    }


    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String mostrarInfo() {
        return "Esta pelicula se estreno en el año " + this.getYearLanzamiento()
                + " y su duracion es de " + this.duracion + " horas";

    }
    
}
