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
public class Alimento {

    private String tipo;
    private double precio;
    private String nombre;
    private int id;
    private int cant;

    public Alimento() {
    }

    public Alimento(String tipo, double precio, String nombre, int id,int cantidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.nombre = nombre;
        this.id = id;
    }

    public void getCant() {
        cant--;
    }

    public int getTotal() {
        return cant;
    }
    
    public void setCant(int cant) {
        this.cant += cant;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
