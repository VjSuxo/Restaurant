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
public class ColaMesa {
   
    int max = 50;
    Mesa[] c = new Mesa[max];
    int frente,fin;

    public ColaMesa() {
        this.frente = -1;
        this.fin = -1;
    }
  
    public int getFin() {
        return fin;
    }
       
    public boolean esVacia(){
        if(frente==-1)
            return true;
        else
            return false;
    }
    
    public boolean esLlena(){
        if(fin==(max-1))
            return true;
        else
            return false;
    }
    
    public void adicola(Mesa dato){
        if(esLlena())
            System.out.println("Cola Llena");
        else {
            fin=fin+1;
            c[fin]=dato;
            if(fin==0)
                frente=0;
        }
    }
    public Mesa elicola(){
        Mesa dato= new Mesa();
        if(esVacia())
            System.out.println("Cola Vacia");
        else
        {
            dato=c[frente];
            if(frente==fin)
            {
                frente=fin=-1;
            }
            else
                frente=frente+1;
        }
        return dato;
    }
    public void mostrarCola(){
        Mesa dato;
        ColaMesa caux=new ColaMesa();
        System.out.println("Los datos de la cola son:");
        while(!esVacia()){
            dato=elicola();
            caux.adicola(dato);
            System.out.println(" "+dato);
        }
        vaciarCola(caux);
    }
    public void vaciarCola(ColaMesa aux){
        while(!aux.esVacia())
            adicola(aux.elicola());
    }
   
 
}
