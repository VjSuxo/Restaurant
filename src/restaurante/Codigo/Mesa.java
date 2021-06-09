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
public class Mesa {
    
    ListaSPedido Pedido;
    boolean Estado;
    int CantidadPersonas;
    Factura Factura;
    int id;
    public Mesa() {
    }

    public Mesa(ListaSPedido Pedido, boolean Estado, int CantidadPersonas, Factura Factura,int id) {
        this.Pedido = Pedido;
        this.Estado = Estado;
        this.CantidadPersonas = CantidadPersonas;
        this.Factura = Factura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListaSPedido getPedido() {
        return Pedido;
    }

    public void setPedido(ListaSPedido Pedido) {
        this.Pedido = Pedido;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public Factura getFactura() {
        return Factura;
    }

    public void setFactura(Factura Factura) {
        this.Factura = Factura;
    }
    
    
}
