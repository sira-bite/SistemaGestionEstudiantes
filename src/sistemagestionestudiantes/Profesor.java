/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionestudiantes;

/**
 *
 * @author Usuario
 */
public class Profesor {
  private String id;
    private String nombre;

    public Profesor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String mostrarInformacion() {
        return id + " - " + nombre;
    }  
}
