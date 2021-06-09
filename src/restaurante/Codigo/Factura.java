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
public class Factura {
    ListaSPedido Lp;
    String Nombre;
    int Nit;
    double Total;

    public Factura() {
    }

    public Factura(ListaSPedido Lp, String Nombre, int Nit, double Total) {
        this.Lp = Lp;
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.Total = Total;
    }

    public ListaSPedido getLp() {
        return Lp;
    }

    public void setLp(ListaSPedido Lp) {
        this.Lp = Lp;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
