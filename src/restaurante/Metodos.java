/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import restaurante.Codigo.*;

/**
 *
 * @author Tostadora
 */
public class Metodos {
    
    public Restaurante CrearBase(){
    
        ListaSMesero listamesero = new ListaSMesero();
        ColaAlimento colaAlimento = new ColaAlimento();
        ColaMesa colaMesa = new ColaMesa();
        
         Restaurante res = new Restaurante();
        
        return res;
    }
    
    public ColaAlimento generarAlimentos(){
    
        ColaAlimento colaAlimento = new ColaAlimento();
        PilaAlimento pilaAlimento = new PilaAlimento();
        
        //Hambuerguesa
        Alimento alimento = new Alimento("plato", 25.5,"Hamburguesa", 1);
        pilaAlimento.llenar(alimento,10);
        colaAlimento.adicola(pilaAlimento);
        
        //Pollo Frito
        alimento = new Alimento("plato", 17,"Pollo Frito", 2);
        pilaAlimento = new PilaAlimento();
        pilaAlimento.llenar(alimento,3);
        colaAlimento.adicola(pilaAlimento);
        
        //charque
        alimento = new Alimento("plato", 10,"charque", 3);
        pilaAlimento = new PilaAlimento();
        pilaAlimento.llenar(alimento,3);
        colaAlimento.adicola(pilaAlimento);
        
        //papas fritas
        alimento = new Alimento("extra", 9,"Papa Frita", 4);
        pilaAlimento = new PilaAlimento();
        pilaAlimento.llenar(alimento,5);
        colaAlimento.adicola(pilaAlimento);
        
        //Arroz Chaufa
        alimento = new Alimento("plato", 17,"Pollo Frito", 5);
        pilaAlimento = new PilaAlimento();
        pilaAlimento.llenar(alimento,3);
        colaAlimento.adicola(pilaAlimento);
        
        //Helado
        alimento = new Alimento("extra", 12,"helado", 6);
        pilaAlimento = new PilaAlimento();
        pilaAlimento.llenar(alimento,10);
        colaAlimento.adicola(pilaAlimento);
        
        
        return colaAlimento;
    }
    
    public ColaMesa generarMesas(){
    
        ColaMesa colaMesa = new ColaMesa();
        colaMesa.adicola(dato);
        return colaMesa;
        
    }
}
