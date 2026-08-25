/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionestudiantes;

/**
 *
 * @author Usuario
 */
public class Curso {
     private String codigo; 
    private String nombre; 
  
    public Curso(String codigo, String nombre) { 
        this.codigo = codigo; 
        this.nombre = nombre; 
    } 
  
    public String mostrarInformacion() { 
        return codigo + " - " + nombre; 
    }
}
