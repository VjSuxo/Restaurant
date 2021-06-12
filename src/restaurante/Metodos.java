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
    
        ColaAlimento colaAlimento = new ColaAlimento();
        ColaMesa colaMesa = new ColaMesa();
        colaAlimento = generarAlimentos();
        colaMesa = generarMesas();
        
        Restaurante res = new Restaurante(colaAlimento, colaMesa);
         
        return res;
    }
    
    //Generar datos base
    
    public ColaAlimento generarAlimentos(){
        System.out.println("alimentos");
        ColaAlimento colaAlimento = new ColaAlimento();
        
        //Hambuerguesa
        Alimento alimento = new Alimento("plato", 25.5,"Hamburguesa", 1,10);
        colaAlimento.adicola(alimento);
        
        //Pollo Frito
        alimento = new Alimento("plato", 17,"Pollo Frito", 2,15);
        colaAlimento.adicola(alimento);
        
        //charque
        alimento = new Alimento("plato", 10,"charque", 3,13);
        colaAlimento.adicola(alimento);
        
        //papas fritas
        alimento = new Alimento("extra", 9,"Papa Frita", 4,10);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("extra", 9,"Arroz frito", 4,10);
        colaAlimento.adicola(alimento);
        
        
        //Arroz Chaufa
        alimento = new Alimento("plato", 17,"Silpancho", 5,12);
        colaAlimento.adicola(alimento);
        
        //Helado
        alimento = new Alimento("postre", 12,"helado", 6,13);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("postre", 12,"mofin", 6,13);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("postre", 12,"pie manzana", 6,13);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("postre", 12,"pie limon", 6,13);
        colaAlimento.adicola(alimento);
        
        
        alimento = new Alimento("bebida", 12,"cafe", 6,13);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("bebida", 12,"te", 6,13);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("bebida", 12,"limonada", 6,13);
        colaAlimento.adicola(alimento);
        
        alimento = new Alimento("bebida", 12,"cerveza", 6,13);
        colaAlimento.adicola(alimento);
        return colaAlimento;
    }
    
    public ColaMesa generarMesas(){
        System.out.println("mesa");
        ColaMesa colaMesa = new ColaMesa();
        for (int i = 0; i < 10; i++) {
            Mesa mes = new Mesa(true, 4, i);
            colaMesa.adicola(mes);
            
        }
        
        
        return colaMesa;
        
    }
    
    // fin de generacion datos base
    
    //Agregar pedido
    
    public ListaSPedido Pedido(ColaAlimento cl,ListaSPedido lp,String alimento){
    
        ColaAlimento aux = new ColaAlimento();
        
        while(!aux.esVacia()){
        
            Alimento al = aux.elicola();
            
            if(al.getNombre().equals(alimento)){
                lp.adifinal(al);
                al.getCant();
            }
            
            aux.adicola(al);
            
        }
        cl.vaciarCola(aux);
        
        return lp;
    }
    
    //fin pedido
    
    public ColaAlimento Agregar(ColaAlimento cl,Alimento al){
        int sw = 0;
        ColaAlimento aux = new ColaAlimento();
        while(!cl.esVacia()){
        
            Alimento ali = cl.elicola();
            if(ali.getNombre().equals(al.getNombre())){
            
                ali.setCant(al.getTotal());
                sw = 1;
            }
            aux.adicola(ali);
        
        }
        if(sw==0){
            aux.adicola(al);
        }
        
        cl.vaciarCola(aux);
        
        return cl;
    }
    
    
    
    
}
