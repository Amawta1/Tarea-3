/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author amawt
 */
public class Actor {
    private int fechaNacimiento;
    private String lugarNacimiento;
    private String nombreActor;

    public Actor(int fC,String lG, String no) {
        this.fechaNacimiento = fC;
        this.lugarNacimiento = lG;
        this.nombreActor = no;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public String mostrarInfo() {
        return "Quien nació en "
                + this.getLugarNacimiento() + " en la fecha de " + this.getFechaNacimiento();
    }
    
}
