/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Codigo;

/**
 *
 * @author Tostadora
 */
public class Mesero {
    
    private ColaMesa CM;
    private String Nombre;
    private String Ci;

    public Mesero() {
    }

    public Mesero(ColaMesa CM, String Nombre, String Ci) {
        this.CM = CM;
        this.Nombre = Nombre;
        this.Ci = Ci;
    }

    public ColaMesa getCM() {
        return CM;
    }

    public void setCM(ColaMesa CM) {
        this.CM = CM;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }
    
}
