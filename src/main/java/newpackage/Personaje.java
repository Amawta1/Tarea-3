/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author amawt
 */
public class Personaje {
    
    private String nombrePersonaje;
    private Actor interprete;
    private Pelicula film;

    public Personaje(String nP, String r, Actor i, Pelicula f) {

        this.nombrePersonaje = nP;
        this.interprete = i;
        this.film = f;

    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }


    public Actor getInterprete() {
        return interprete;
    }

    public void setInterprete(Actor interprete) {
        this.interprete = interprete;
    }

    public Pelicula getFilm() {
        return film;
    }

    public void setFilm(Pelicula film) {
        this.film = film;
    }

    public String mostrarInfo() {
        return "El personaje " + this.getNombrePersonaje()
                + " participa en la pelicula: " + this.getFilm().getNombrePelicula()
                + ", y el actor que le da vida al personaje es " + this.getInterprete().getNombreActor();
    }

    
}
