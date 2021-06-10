/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import Frames.Factura;
import Frames.*;
import restaurante.Codigo.*;

/**
 *
 * @author Tostadora
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos met = new Metodos();
        Restaurante res =  met.CrearBase();
//        Factura fav = new Factura();
//        fav.setColaAlimento(res.getCAlimento());
//        fav.setColaMesa(res.getCMesa());
//        fav.Cargar();
//        fav.show();

//            Producto pr = new Producto();
//            pr.setTipo("plato");
//            pr.setCl(res.getCAlimento());
//            pr.cargar();
//            pr.show();
        
        System.out.println("*/*/*/*/*/");
        Pedido ped = new Pedido();
        ped.Base(res);
        ped.show();

        
     
            

    }
    
}
