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
public class Restaurante {
    ListaSMesero LMesero;
    ColaAlimento CAlimento;
    ColaMesa CMesa;

    public Restaurante() {
    }

    public Restaurante(ListaSMesero LMesero, ColaAlimento CAlimento, ColaMesa CMesa) {
        this.LMesero = LMesero;
        this.CAlimento = CAlimento;
        this.CMesa = CMesa;
    }

    public ListaSMesero getLMesero() {
        return LMesero;
    }

    public void setLMesero(ListaSMesero LMesero) {
        this.LMesero = LMesero;
    }

    public ColaAlimento getCAlimento() {
        return CAlimento;
    }

    public void setCAlimento(ColaAlimento CAlimento) {
        this.CAlimento = CAlimento;
    }

    public ColaMesa getCMesa() {
        return CMesa;
    }

    public void setCMesa(ColaMesa CMesa) {
        this.CMesa = CMesa;
    }
    
    
}
