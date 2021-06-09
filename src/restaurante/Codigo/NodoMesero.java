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
public class NodoMesero {
    Mesero mesero;
    NodoMesero sig;

    public NodoMesero() {
        sig = null;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public NodoMesero getSig() {
        return sig;
    }

    public void setSig(NodoMesero sig) {
        this.sig = sig;
    }
    
    
}
