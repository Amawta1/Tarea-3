/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package newpackage;

/**
 *
 * @author amawt
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        var leonardo = new Actor(1974, "Estados Unidos",
                "Leonardo DiCaprio");
        var joaquin = new Actor(1946, "Mexico",
                "Joaquín Cosío");
        var padrino1 = new Actor(1940, "Nueva York",
                "Alfredo James Pacino");

        var lobo = new Pelicula("Lobo de Wall Street", 2013, 3.0);
        var infierno = new Pelicula("El infierno", 2010, 2.50);
        var padrino = new Pelicula("El padrino", 1972, 3.5);

        var jordan = new Personaje("Jordan Belfort", "Protagonista",
                leonardo, lobo);
        var cochiloco = new Personaje("Cochiloco", "Protagonista",
                joaquin, infierno);
        var michael = new Personaje("Michael Corleone", "Protagonista",
                padrino1, padrino);

        System.out.println(cochiloco.mostrarInfo());
        System.out.println(joaquin.mostrarInfo());
        System.out.println(infierno.mostrarInfo());
        System.out.println("");

        System.out.println(jordan.mostrarInfo());
        System.out.println(leonardo.mostrarInfo());
        System.out.println(lobo.mostrarInfo());
        System.out.println("");

        System.out.println(michael.mostrarInfo());
        System.out.println(padrino1.mostrarInfo());
        System.out.println(padrino.mostrarInfo());
        System.out.println("");
    }

    
}
