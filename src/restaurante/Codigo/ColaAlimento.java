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
public class ColaAlimento {
      int max = 100;
    Alimento[] c = new Alimento[max];
    int frente,fin;

    public ColaAlimento(int max) {
        this.max = max;
        c = new Alimento[max];
        this.frente = -1;
        this.fin = -1;
    }
    public ColaAlimento() {
       
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
    
    public void adicola(Alimento dato){
        if(esLlena())
            System.out.println("Cola Llena");
        else {
            fin=fin+1;
            c[fin]=dato;
            if(fin==0)
                frente=0;
        }
    }
    public Alimento elicola(){
        Alimento dato= new Alimento();
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
        Alimento dato;
        ColaAlimento caux=new ColaAlimento(max);
        System.out.println("Los datos de la cola son:");
        while(!esVacia()){
            dato=elicola();
            caux.adicola(dato);
            System.out.println(" "+dato);
        }
        vaciarCola(caux);
    }
    public void vaciarCola(ColaAlimento aux){
        while(!aux.esVacia())
            adicola(aux.elicola());
    }
   
 
}
