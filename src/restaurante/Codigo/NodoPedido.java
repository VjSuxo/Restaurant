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
public class NodoPedido {
    Alimento Alimento;
    NodoPedido sig;

    public NodoPedido() {
        sig = null;
    }

    public Alimento getAlimento() {
        return Alimento;
    }

    public void setAlimento(Alimento Alimento) {
        this.Alimento = Alimento;
    }

   
    public NodoPedido getSig() {
        return sig;
    }

    public void setSig(NodoPedido sig) {
        this.sig = sig;
    }
    
    
    
}
